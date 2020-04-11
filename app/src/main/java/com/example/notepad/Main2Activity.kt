package com.example.notepad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    private var radiobtn = ArrayList<RadioButton>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        radiobtn.add(one)
        radiobtn.add(two)
        radiobtn.add(three)

        //判断哪个单选按钮选中，并设置相应图片
        for ((id,btn) in radiobtn.withIndex()){
            if (btn.isChecked && id == 0){
                image.setImageResource(R.drawable.test)
            }else if (btn.isChecked && id == 1){
                image.setImageResource(R.drawable.test1)
            }else if (btn.isChecked && id == 2){
                image.setImageResource(R.drawable.test2)
            }
        }

        for (index in radiobtn){
            index.setOnCheckedChangeListener { buttonView, isChecked ->
                if(isChecked){
                    when(buttonView.id){
                        one.id -> image.setImageResource(R.drawable.test)
                        two.id -> image.setImageResource(R.drawable.test1)
                        three.id -> image.setImageResource(R.drawable.test2)
                    }
                    Toast.makeText(buttonView.context,"控件名字："+buttonView.text+"，是否选中：" + isChecked,Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}

