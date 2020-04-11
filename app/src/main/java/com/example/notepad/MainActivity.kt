package com.example.notepad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.ViewCompat
import androidx.core.view.ViewPropertyAnimatorListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),ViewPropertyAnimatorListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //为启动图片设置属性动画
        ViewCompat.animate(image).scaleY(1.5f).scaleX(1.5f).setListener(this).duration = 2000
    }

    override fun onAnimationEnd(view: View?) {
       image.context.startActivity(Intent(applicationContext,Main2Activity::class.java))
    }

    override fun onAnimationCancel(view: View?) {

    }

    override fun onAnimationStart(view: View?) {

    }
}
