package com.example.dosisogae;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    TextView text1;
    TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent=getIntent();

        DataModel dt=(DataModel)intent.getSerializableExtra("name");

        setContentView(R.layout.activity_main2);

        text1=(TextView)findViewById(R.id.textView2);
        text2=(TextView)findViewById(R.id.textView3);

        text1.setText((String)dt.title.toString());
        text2.setText((String)dt.script.toString());
    }
}
