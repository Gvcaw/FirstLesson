package sg.edu.rp.c346.id21024429.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText etName;
    EditText etNum;
    EditText etPax;
    RadioGroup rgArea;
    DatePicker dp;
    TimePicker tp;
    Button confirm;
    Button reset;
    TextView output1;
    TextView output2;
    TextView output3;
    TextView output4;
    TextView output5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.editTextName);
        etNum = findViewById(R.id.editTextNum);
        etPax = findViewById(R.id.editTextSizing);
        rgArea = findViewById(R.id.radioGroup1);
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        reset = findViewById(R.id.buttonReset);
        confirm = findViewById(R.id.buttonConfirm);
        output1 = findViewById(R.id.textViewOutput1);
        output2 = findViewById(R.id.textViewOutput2);
        output3 = findViewById(R.id.textViewOutput3);
        output4 = findViewById(R.id.textViewOutput4);
        output5 = findViewById(R.id.textViewOutput5);

        tp.setCurrentHour(19);
        tp.setCurrentMinute(30);
        dp.updateDate(2020,6,1);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                etName.getText().clear();
                etPax.getText().clear();
                etNum.getText().clear();
                rgArea.clearCheck();
                tp.setCurrentHour(19);
                tp.setCurrentMinute(30);
                dp.updateDate(2020,6,1);
            }
        });
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if(etName.getText().toString().length() == 0 || etPax.getText().toString().length() == 0 || etNum.getText().toString().length() == 0){
                    Toast.makeText(MainActivity.this,"Required Information not filled",Toast.LENGTH_SHORT);
                }else{
                    Toast.makeText(MainActivity.this, "Information Confirmed",Toast.LENGTH_SHORT);
                    String Time = "Time:" + tp.getCurrentHour() + tp.getCurrentMinute();
                    String Date = "Date:" + dp.getDayOfMonth()+"/"+dp.getMonth()+"/"+ dp.getYear();
                    output1.setText(Time);
                    output2.setText(Date);
                    output3.setText(etName.getText());
                    output4.setText(etNum.getText());
                    output5.setText(etPax.getText());

                }
            }
        });
    }
}