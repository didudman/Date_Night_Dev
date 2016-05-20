package com.example.david.datenightdev;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class DetailActivity extends AppCompatActivity {
    private ImageView detailImage;
    private ArrayList<MainDataDef> detailData;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        detailImage = (ImageView) findViewById(R.id.detail_image);
        TextView detailName = (TextView) findViewById(R.id.detail_name);
        TextView detailTheme = (TextView) findViewById(R.id.detail_theme);
        TextView detailText = (TextView) findViewById(R.id.detail_text);
        detailText.setMovementMethod(new ScrollingMovementMethod());

        int i = MainActivity.currentItem;
        Random n = new Random();
        int m = n.nextInt((600-20)+ 1)+20;
        setTitle(getString(R.string.app_name)+" - " + MainData.nameArray[i]);
        detailImage.setImageResource(MainData.detailImageArray[i]);
        detailName.setText(MainData.nameArray[i]);
        detailTheme.setText(MainData.detailThemeArray[i]);
        detailText.setText(MainData.detailTextArray[i]);
    }
}
