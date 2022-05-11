
package sg.edu.rp.c346.id21024429.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cbEnabled;
    Button btnCheck;
    TextView tvShow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvShow = findViewById(R.id.textView);
        btnCheck = findViewById(R.id.button);
        cbEnabled = findViewById(R.id.checkBox);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String given = "The discount is ";
                if(cbEnabled.isChecked() == true){
                    double pay = calcPay(100,20);
                    tvShow.setText(given + "given" + " You need to pay " + pay);
                }else{
                    double pay = calcPay(100,0);
                    tvShow.setText(given + "not given." + " You need to pay " + pay);
                }
                Log.i("MyActivity", "Inside onClick()");

                Toast.makeText(MainActivity.this, "Button Click", Toast.LENGTH_LONG).show();



            }
            private double calcPay(double price, double discount){
                double pay = price * (1- discount/100);
                return pay;
            }


        });

    }
}