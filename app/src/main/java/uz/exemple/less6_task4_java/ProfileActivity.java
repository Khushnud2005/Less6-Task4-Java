package uz.exemple.less6_task4_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import uz.exemple.less6_task4_java.model.MemberModel;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        initViews();
    }

    void initViews(){
        TextView text1 = (TextView) findViewById(R.id.tv_profile);

        MemberModel member = (MemberModel) getIntent().getSerializableExtra("member");

        text1.setText(member.toString());

    }
}