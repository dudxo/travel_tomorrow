package com.example.test123;

import static com.example.test123.R.id.recommend_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements  QuantityListener{

    RecyclerView recommend_view;
    RecyclerView custom_view;
    QuantityAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recommend_view = findViewById(R.id.recommend_view);
        custom_view = findViewById(R.id.custom_view);
        setRecyclerView();
        setRecyclerView2();
    }


    private ArrayList<String> getQuantityData(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("10 kg");
        arrayList.add("120 kg");
        arrayList.add("130 kg");
        arrayList.add("140 kg");
        return arrayList;
    }
    private ArrayList<String> getQuantityData2(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1610 kg");
        arrayList.add("14120 kg");
        arrayList.add("114130 kg");
        arrayList.add("14140 kg");
        arrayList.add("114150 kg");
        return arrayList;
    }
    private void setRecyclerView() {
        recommend_view.setHasFixedSize(true);
        recommend_view.setLayoutManager(new LinearLayoutManager(this));
        adapter = new QuantityAdapter(this,getQuantityData(),this);
        recommend_view.setAdapter(adapter);
    }
    private void setRecyclerView2() {
        recommend_view.setHasFixedSize(true);
        recommend_view.setLayoutManager(new LinearLayoutManager(this));
        adapter = new QuantityAdapter(this,getQuantityData2(),this);
        recommend_view.setAdapter(adapter);
    }
    @Override
    public void onQuantityChange(ArrayList<String> arrayList) {
        //TODO
        Toast.makeText(this, arrayList.toString(), Toast.LENGTH_SHORT).show();
    }
}