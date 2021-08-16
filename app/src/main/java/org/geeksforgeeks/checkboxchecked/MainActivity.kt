package org.geeksforgeeks.checkboxchecked

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mCheckBox = findViewById<CheckBox>(R.id.check_box)
        val mButton = findViewById<Button>(R.id.button)

        mButton.setOnClickListener {
            if(mCheckBox.isChecked){
                // Do something
                Toast.makeText(applicationContext,"Accepted", Toast.LENGTH_SHORT).show()
            } else {

                // change color_secondary to make the check box red.
                mCheckBox.text = "Please Accept this!"
                mCheckBox.setTextColor(Color.parseColor("#FF0000"))
            }
        }
    }
}