package sg.edu.rp.c346.id21024429.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {

    TextView tvAnswer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        tvAnswer2 = findViewById(R.id.textView4);
        //       tvAnswer.setText("In Second Activity");
        Intent intentReceived =getIntent();
        String questionSelectedThat = intentReceived.getStringExtra("Question2");
        tvAnswer2.setText(questionSelectedThat + " answer is Gone");
    }
}