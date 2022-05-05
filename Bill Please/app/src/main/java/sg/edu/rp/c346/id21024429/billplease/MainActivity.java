package sg.edu.rp.c346.id21024429.billplease;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    EditText etAmount;
    EditText etPax;
    ToggleButton tbtnsvs;
    ToggleButton tbtngst;
    EditText etDiscount;
    RadioGroup rgGender;
    Button split;
    Button reset;
    TextView total;
    TextView each;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAmount = findViewById(R.id.editTextAmount);
        etPax = findViewById(R.id.editTextNumPax);
        tbtnsvs = findViewById(R.id.toggleButtonSVS);
        tbtngst = findViewById(R.id.toggleButtonGST);
        etDiscount = findViewById(R.id.editTextDiscount);
        rgGender = findViewById(R.id.radioGroup1);
        split = findViewById(R.id.buttonSplit);
        reset = findViewById(R.id.buttonReset);
        total = findViewById(R.id.textViewTotal);
        each = findViewById(R.id.textViewEach);

        split.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if(etAmount.getText().toString().length() == 0 ||etPax.getText().toString().length() == 0){
                    Toast.makeText(MainActivity.this,"Input is invalid. Please enter information",Toast.LENGTH_SHORT).show();
                }else{
                    String data1 = etAmount.getText().toString();

                }
                String data1 = etAmount.getText().toString();


                double finalamount = 0;
                double current = Double.parseDouble(data1);

                if(tbtnsvs.isChecked() == true&& tbtngst.isChecked()== true){
                    finalamount = ((current * 0.9) * 0.93);
                }else if(tbtnsvs.isChecked() != true && tbtngst.isChecked()== true){
                    finalamount = (current * 0.93);
                }else if(tbtnsvs.isChecked() == true && tbtngst.isChecked()!= true){
                    finalamount = (current * 0.9);
                }else{
                    finalamount = current;
                }

                int discounted = Integer.parseInt(etDiscount.getText().toString());
                double totalDisplay = finalamount * (1-discounted);
                double paxx = Double.parseDouble(etDiscount.getText().toString());
                double eachPay = totalDisplay/ paxx;
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                String msg = String.format("%.2f",totalDisplay);
                total.setText("Total Amount: $" + msg);
                String msg2 = String.format("%.2f",eachPay);
                if(checkedRadioId == R.id.radioButton2){
                    each.setText("Each Pays: $" + msg2 + " in cash");
                }else{
                    each.setText("Each Pays: $" + msg2 + " via PayNow to 912345678");
                }

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                etAmount.getText().clear();
                etPax.getText().clear();
                etDiscount.getText().clear();
                tbtngst.setChecked(true);
                tbtnsvs.setChecked(true);

            }



        });


    }
}