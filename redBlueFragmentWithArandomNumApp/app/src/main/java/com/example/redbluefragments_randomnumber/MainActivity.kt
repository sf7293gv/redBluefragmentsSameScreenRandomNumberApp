package com.example.redbluefragments_randomnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.setFragmentResultListener(RANDOM_NUMBER_GENERATED, this) {
            requestKey, bundle ->
                // swap out red fragment for blue
            supportFragmentManager.beginTransaction().add(R.id.fragmentContainerView, BlueFragment.newInstance()).addToBackStack("BLUE").commit()

            // pause red fragment, add blue fragment on top of it

        }
    }
}