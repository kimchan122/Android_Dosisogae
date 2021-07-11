package com.example.dosisogae;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;
import android.app.ActionBar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    TextView text1;
    TextView text2;
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent=getIntent();

        DataModel dt=(DataModel)intent.getSerializableExtra("name");

        setContentView(R.layout.activity_main2);

        text1=(TextView)findViewById(R.id.textView2);
        text2=(TextView)findViewById(R.id.textView3);
        img1=(ImageView)findViewById(R.id.imageView1);

        text1.setText((String)dt.title.toString());
        text2.setText((String)dt.script.toString());
        img1=findViewById(R.id.imageView1);

    }
}
