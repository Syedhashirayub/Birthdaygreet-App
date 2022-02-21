package com.syedhashirayub.bdaaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.syedhashirayub.bdaaygreet.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

//import com.syedhashirayub.bdaaygreet.databinding.ActivityMainBindingImpl


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

    }

    fun createBirthdayCard(view: View) {
       //val name = findViewById<EditText>(R.id.nameInput).editableText.toString()
        //binding.nameInput.editableText.toString()
        val name  = nameInput.editableText.toString()
        Toast.makeText(this,"name is $name",Toast.LENGTH_LONG).show()  //when button(Create birthday card) was clicked it will show in bottom "Button was clicked".

        val intent = Intent(this,birthdaygreetingactivity::class.java)
        startActivity(intent)    //Intent is constructor its syntax consist of two context, one represent the activity which u are in now and other represent the activity which u are switching to.
                               //pass Intent in startActivity function

        intent.putExtra(birthdaygreetingactivity.NAME_EXTRA,name)




    }
}