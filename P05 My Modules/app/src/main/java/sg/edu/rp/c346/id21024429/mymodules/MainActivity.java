package sg.edu.rp.c346.id21024429.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvAndroid;
    TextView tvForensics;
    TextView tvNetworks;
    TextView tvPHP;
    TextView tvOS;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAndroid = findViewById(R.id.textViewAndroid);
        tvForensics = findViewById(R.id.textViewForensics);
        tvNetworks = findViewById(R.id.textViewNetworks);
        tvPHP = findViewById(R.id.textViewPHP);
        tvOS = findViewById(R.id.textViewOS);

        tvAndroid.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("C346",346);
                startActivity(intent);
            }
        });

        tvPHP.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("C203",203);
                startActivity(intent);
            }
        });

        tvForensics.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("C331",331);
                startActivity(intent);
            }
        });

        tvNetworks.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("C328",328);
                startActivity(intent);
            }
        });

        tvOS.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("C229",229);
                startActivity(intent);
            }
        });
    }

}