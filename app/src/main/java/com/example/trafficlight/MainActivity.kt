package com.example.trafficlight

import TrafficLight
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val redLight = findViewById<View>(R.id.red_light)
        val yellowLight = findViewById<View>(R.id.yellow_light)
        val greenLight = findViewById<View>(R.id.green_light)


        val trafficLightManager = TrafficLight(
            redLight,
            yellowLight,
            greenLight,
            lifecycleScope
        )


        manageTrafficLightInRealTime(trafficLightManager)
    }

    private fun manageTrafficLightInRealTime(trafficLightManager: TrafficLight) {
        lifecycleScope.launch {
            while (true) {
                val calendar = Calendar.getInstance()
                val hour = calendar.get(Calendar.HOUR_OF_DAY)

                if (hour in 0..4) {
                    trafficLightManager.activateBlinkingYellowLight()
                } else {
                    trafficLightManager.activateTrafficLightCycle()
                }

                delay(60000)
            }
        }
    }
}
