package app.aplicacion.versionerror

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.sql.DriverManager.println

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("trabajo 1")
        println("trabajo 2")
        println("trabajo 3")
    }
}