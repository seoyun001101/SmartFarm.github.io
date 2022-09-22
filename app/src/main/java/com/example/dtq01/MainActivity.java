package com.example.dtq01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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