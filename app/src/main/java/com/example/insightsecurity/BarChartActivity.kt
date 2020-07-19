package com.example.insightsecurity

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.utils.ColorTemplate

class BarChartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bar_chart)

        var barChart = findViewById<BarChart>(R.id.barChart);
        var visitors = ArrayList<BarEntry>();
        visitors.add(BarEntry(2014f,420f));
        visitors.add(BarEntry(2015f,475f));
        visitors.add(BarEntry(2016f,508f));
        visitors.add(BarEntry(2017f,668f));
        visitors.add(BarEntry(2018f,550f));
        visitors.add(BarEntry(2019f,630f));
        visitors.add(BarEntry(2020f,470f));

        var barDataSet = BarDataSet(visitors, "Visitors");
        var barData = BarData(barDataSet);
        barChart.setFitBars(true);
        barChart.data = barData;
        barChart.description.text = "Bar Chart";
        barChart.animateY(2000);

    }
}