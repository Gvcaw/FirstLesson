package sg.edu.rp.c346.id21024429.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Event handling Step 1
    Button btnPassInteger;
    Button btnPassChar;
    TextView tvAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Event handling step 2
        btnPassInteger = findViewById(R.id.buttonInt);
        btnPassChar = findViewById(R.id.buttonChar);
        tvAnswer = findViewById(R.id.textViewDoublePass);

        //Event Handling step 3
        btnPassInteger.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("value",1);
                startActivity(intent);
            }
        });

        btnPassChar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                intent.putExtra("value2",'a');
                startActivity(intent);
            }
        });

        tvAnswer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, FourthActivity.class);
                intent.putExtra("value3",99.99);
                startActivity(intent);
            }
        });

    }
}