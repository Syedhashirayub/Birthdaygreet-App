package com.syedhashirayub.bdaaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.syedhashirayub.bdaaygreet.databinding.ActivityBirthdaygreetingactivityBinding
import kotlinx.android.synthetic.main.activity_birthdaygreetingactivity.*


class birthdaygreetingactivity : AppCompatActivity() {
    lateinit var binding: ActivityBirthdaygreetingactivityBinding

    companion object{                                     //static variable
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthdaygreetingactivity)

        val name = intent.getStringExtra(NAME_EXTRA)
       birthdayGreeting.text ="Happy Birthday\n$name! "
        //findViewById<TextView>(R.id.birthdayGreeting).text="HAPPY BIRTHDAY $name"



    }
}