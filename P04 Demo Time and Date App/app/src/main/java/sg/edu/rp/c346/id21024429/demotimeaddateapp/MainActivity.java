package sg.edu.rp.c346.id21024429.demotimeaddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tp = findViewById(R.id.timePicker);
        dp = findViewById(R.id.datePicker);
        btnDisplayTime = findViewById(R.id.button3);
        btnDisplayDate = findViewById(R.id.button4);
        tvDisplay = findViewById(R.id.textView2);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hour = tp.getCurrentHour();
                int minute = tp.getCurrentMinute();
                tvDisplay.setText("Time is "+hour+":"+minute);

            }
        });
        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int month = dp.getMonth()+1;
                int day = dp.getDayOfMonth();
                int year = dp.getYear();
                tvDisplay.setText("Date is "+day+"/"+month+"/"+year);



            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                tp.setCurrentHour(0);
                tp.setCurrentMinute(0);
                dp.updateDate(2020,1,1);
            }



        });



    }
}