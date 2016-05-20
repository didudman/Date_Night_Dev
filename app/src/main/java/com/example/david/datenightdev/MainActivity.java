package com.example.david.datenightdev;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static View.OnClickListener mainOnClickListener;
    private RecyclerView recyclerView;
    public static int currentItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.main_recycler_view);
        recyclerView.setHasFixedSize(true);
        mainOnClickListener = new MainOnClickListener(this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<MainDataDef> mainData = new ArrayList<MainDataDef>();
        for (int i = 0; i <MainData.nameArray.length; i++){
            mainData.add(new MainDataDef(
                    MainData.imageArray[i],
                    MainData.nameArray[i],
                    MainData.summaryArray[i]
            ));
        }
        RecyclerView.Adapter adapter = new MainAdapter(mainData);
        recyclerView.setAdapter(adapter);
    }
    private class MainOnClickListener implements View.OnClickListener{
        private final Context context;
        private MainOnClickListener(Context c){
            this.context = c;
        }
        @Override
        public void onClick(View v){
            currentItem = recyclerView.getChildPosition(v);
            startActivity(new Intent(getApplicationContext(), DetailActivity.class));
        }

    }
}
