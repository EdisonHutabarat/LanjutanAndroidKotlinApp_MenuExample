package id.ac.polbeng.edisonrizal.intentexample1

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.edisonrizal.intentexample1.databinding.ActivityMainBinding
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {

    private val Log = Logger.getLogger(MainActivity::class.java.name)
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.info("onCreate")

        binding.btnSecondActivity.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onPause() {
        super.onPause()
        Log.info("onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.info("onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.info("onResume")
    }
}