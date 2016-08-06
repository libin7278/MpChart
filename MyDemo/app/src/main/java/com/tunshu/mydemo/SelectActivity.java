package com.tunshu.mydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectActivity extends AppCompatActivity {
    private Button btn_bar_chart;
    private Button btn_pie_chart_with_line;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        btn_bar_chart= (Button) findViewById(R.id.btn_bar_chart);
        btn_pie_chart_with_line= (Button) findViewById(R.id.btn_pie_chart_with_line);

        btn_bar_chart.setOnClickListener(new MyOnclickListener());
        btn_pie_chart_with_line.setOnClickListener(new MyOnclickListener());
    }

    class MyOnclickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            if(v == btn_bar_chart ){
                startActivity(new Intent(SelectActivity.this,BarChartActivity.class));
            }else if(v == btn_pie_chart_with_line){
                startActivity(new Intent(SelectActivity.this,PieChartWithline.class));
            }
        }
    }
}
