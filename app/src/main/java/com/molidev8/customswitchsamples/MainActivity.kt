package com.molidev8.customswitchsamples

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.molidev8.customswitchsamples.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        with(ActivityMainBinding.inflate(layoutInflater)) {
            setContentView(root)
            switchController.setOnClickListener {
                vanillaSwitch.isChecked = !vanillaSwitch.isChecked
                customThumbBigSwitch.isChecked = !customThumbBigSwitch.isChecked
                customThumbSmallSwitch.isChecked = !customThumbSmallSwitch.isChecked
                customTrackSwitch.isChecked = !customTrackSwitch.isChecked
                customTrackPill.isChecked = !customTrackPill.isChecked
            }
        }
    }

}