package com.valoy.compose

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

val uri: Uri? = null
val titleText = ""

class ArticleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article)

        val thumbnail = findViewById<ImageView>(R.id.thumbnail)
        val title = findViewById<TextView>(R.id.title_text)
        val subtitle = findViewById<TextView>(R.id.subtitle_text)
        val favouriteIcon = findViewById<ImageView>(R.id.favourite_icon)
        val content = findViewById<TextView>(R.id.content_text)

        thumbnail.setImageURI(uri)
        title.text = titleText

        // ...
    }


}