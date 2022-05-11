package sg.edu.rp.c346.id21024429.dummy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etname = findViewById(R.id.editTextname);
        btnRegister = findViewById(R.id.buttonRegister);
        tbIsMember = findViewById(R.id.toggleIsMember);
        tvMessage = findViewById(R.id.textViewMessage);
    }
    String message ="Sign up fees:$";
    if(tbIsMember.isChecked()){
        message = message + "5";

    }
}