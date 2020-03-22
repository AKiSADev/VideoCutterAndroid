package it.akisadev.storyvideocutter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCut = findViewById<Button>(R.id.cutButton)
        val btnGet = findViewById<Button>(R.id.caricaButton)
        val videoPlayer = findViewById<VideoView>(R.id.videoView)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoPlayer)
        videoPlayer.setMediaController(mediaController)
        videoPlayer.requestFocus()

        btnCut.setOnClickListener{
            //TODO: CREARE LOGICA DI TAGLIO DEL VIDEO

        }

        btnGet.setOnClickListener{
            //TODO: Logica di scelta del video dal file system

        }

        if (intent?.action == Intent.ACTION_SEND){
            videoPlayer.setVideoURI(intent?.data);
        }

    }

    private fun getVideoFromIntent(intent: Intent){

    }


}
