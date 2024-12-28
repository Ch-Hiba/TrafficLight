import android.view.View
import androidx.lifecycle.LifecycleCoroutineScope
import com.example.trafficlight.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class TrafficLight(
    private val redLight: View,
    private val yellowLight: View,
    private val greenLight: View,
    private val lifecycleScope: LifecycleCoroutineScope
) {

    private var isBlinking = false
    private var isRunning = false


    fun turnOffAllLights() {
        redLight.setBackgroundResource(R.drawable.gray_circle)
        yellowLight.setBackgroundResource(R.drawable.gray_circle)
        greenLight.setBackgroundResource(R.drawable.gray_circle)
    }

    // Cycle normal des feux
    fun activateTrafficLightCycle() {
        stopBlinking()
        isRunning = true
        lifecycleScope.launch {
            while (isRunning) {
                turnOffAllLights()
                redLight.setBackgroundResource(R.drawable.red_circle)
                delay(5000)

                turnOffAllLights()
                yellowLight.setBackgroundResource(R.drawable.yellow_circle)
                delay(2000)

                turnOffAllLights()
                greenLight.setBackgroundResource(R.drawable.green_circle)
                delay(10000)
            }
        }
    }


    fun activateBlinkingYellowLight() {
        stopCycle()
        isBlinking = true
        lifecycleScope.launch {
            while (isBlinking) {
                turnOffAllLights()
                yellowLight.setBackgroundResource(R.drawable.yellow_circle)
                delay(1000)

                turnOffAllLights()
                delay(1000)
            }
        }
    }


    private fun stopBlinking() {
        isBlinking = false
    }


    private fun stopCycle() {
        isRunning = false
    }
}
