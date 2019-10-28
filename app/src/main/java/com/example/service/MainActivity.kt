package com.example.service

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.VideoView



class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_fb.setOnClickListener ({
            val i=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"))
            startActivity(i)
        })
        button_ig.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/"))
            startActivity(i)
        })

        var MediaPlayer:MediaPlayer?= MediaPlayer.create(this,R.raw.arrahmaan)

        button_play.setOnClickListener {
            MediaPlayer?.start()
        }
        button_pause.setOnClickListener {
            MediaPlayer?.pause()
        }
        button_stop.setOnClickListener {
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }

        var VideoView: VideoView?=videoView
        videoView?.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.radenriqi))

        videoView?.start()

        button_playVideo.setOnClickListener {
           videoView?.start()
        }
        button_pauseVideo.setOnClickListener {
            videoView?.pause()
        }
        button_stopVideo.setOnClickListener {
            videoView?.pause()
            videoView?.seekTo(0)
        }
    }
}
