package com.example.insightsecurity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.buttonBarChart).setOnClickListener {
            var intent = Intent(this, BarChartActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.buttonPieChart).setOnClickListener{
            var intent = Intent(this, PieChartActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.buttonRadarChart).setOnClickListener{
            var intent = Intent(this, RadarChartActivity::class.java)
            startActivity(intent)
        }
    }
}