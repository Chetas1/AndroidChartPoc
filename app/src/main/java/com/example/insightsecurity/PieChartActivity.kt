package com.example.insightsecurity

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry

class PieChartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pie_chart)

        var pieChart = findViewById<PieChart>(R.id.pieChart);

        var visitors = ArrayList<PieEntry>();
        visitors.add(PieEntry(508f,2016));
        visitors.add(PieEntry(600f,2017));
        visitors.add(PieEntry(750f,2018));
        visitors.add(PieEntry(600f,2019));
        visitors.add(PieEntry(670f,2020));

        var pieDataSet = PieDataSet(visitors, "Visitors");
        var colors = ArrayList<Int>();
        colors.add(Color.GREEN);
        colors.add(Color.BLUE);
        colors.add(Color.RED);
        colors.add(Color.YELLOW);
        colors.add(Color.DKGRAY);

        pieDataSet.setColors(colors);

        var pieData = PieData(pieDataSet);
        pieChart.data = pieData;
        pieChart.description.isEnabled = false;
        pieChart.centerText = "Visitors";
        pieChart.animate();

    }
}