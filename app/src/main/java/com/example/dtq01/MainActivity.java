package com.example.dtq01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button,button2,button3,button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CropReport.class);
                startActivity(intent);
            }
        });


        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DailyReport.class);
                startActivity(intent);
            }
        });


        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SensorSet.class);
                startActivity(intent);
            }
        });

    }

    public void onButtonClick1(View v)    {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.terms.naver.com/list.naver?cid=46676&categoryId=46676"));
        startActivity(myIntent);
    }

    public void crop_report(View v){
        int id = v.getId();
        LinearLayout layout = (LinearLayout) v.findViewById(id);
        String tag = (String) layout.getTag();

        // Toast.makeText(this, "클릭한 아이템: ", Toast.LENGTH_LONG).show();
        Intent it = new Intent(this, MainActivity.class);
        it.putExtra("it_tag", tag);
        startActivity(it);
    }

    public void daily_report(View v){
        int id = v.getId();
        LinearLayout layout = (LinearLayout) v.findViewById(id);
        String tag = (String) layout.getTag();

        // Toast.makeText(this, "클릭한 아이템: ", Toast.LENGTH_LONG).show();
        Intent it = new Intent(this, MainActivity.class);
        it.putExtra("it_tag", tag);
        startActivity(it);
    }
    public void sensor_set(View v){
        int id = v.getId();
        LinearLayout layout = (LinearLayout) v.findViewById(id);
        String tag = (String) layout.getTag();

        // Toast.makeText(this, "클릭한 아이템: ", Toast.LENGTH_LONG).show();
        Intent it = new Intent(this, MainActivity.class);
        it.putExtra("it_tag", tag);
        startActivity(it);
    }

}