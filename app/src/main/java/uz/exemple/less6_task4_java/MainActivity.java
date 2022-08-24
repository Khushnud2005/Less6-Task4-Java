package uz.exemple.less6_task4_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

import uz.exemple.less6_task4_java.adapter.Adapter;
import uz.exemple.less6_task4_java.model.MemberModel;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    void initViews(){
        recyclerView = findViewById(R.id.recyclerView);
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i=1;i<41;i++){
            arrayList.add("Profile "+ i);
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter(arrayList));
    }

}