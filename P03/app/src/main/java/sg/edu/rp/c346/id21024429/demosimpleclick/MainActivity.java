package sg.edu.rp.c346.id21024429.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //Calling variables//
    Button buttonDisplay;
    EditText editTextInput;
    TextView textViewDisplay;
    ToggleButton tbtn;
    RadioGroup rgGender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bridge UI with controller//
        buttonDisplay = findViewById(R.id.buttonDisplay);
        editTextInput = findViewById(R.id.editTextInput);
        textViewDisplay = findViewById(R.id.textViewDisplay);
        tbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.radioGroupGender);

        //set event listener//
        buttonDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //set actions//
                //grab input from editText and set to textview//
                String stringResponse = editTextInput.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                String finalstringResponse = " ";
                if(checkedRadioId == R.id.radioButtonGenderMale){
                    finalstringResponse = "He says" + " " + stringResponse;

                }else{
                    finalstringResponse = "She says" + " " + stringResponse;
                }
                textViewDisplay.setText(finalstringResponse);
            }



        });
        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                // Add your code for the action
                if(tbtn.isChecked() == true){
                    textViewDisplay.setText("Enabled");
                }else{
                    textViewDisplay.setText("Disabled");
                }







            }
        });



    }
}
