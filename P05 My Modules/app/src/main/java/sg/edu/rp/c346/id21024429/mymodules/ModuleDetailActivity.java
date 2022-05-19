package sg.edu.rp.c346.id21024429.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView codee;
    TextView names;
    TextView years;
    TextView seme;
    TextView credits;
    TextView venue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        codee = findViewById(R.id.textViewCode);
        names = findViewById(R.id.textViewName);
        years = findViewById(R.id.textViewYear);
        seme = findViewById(R.id.textViewSem);
        credits = findViewById(R.id.textViewCredit);
        venue = findViewById(R.id.textViewVen);

        String c0de = "Module Code:";
        String nAME = "Module Name:";
        String yeAr = "Academic Year:";
        String sEmESTERS = "Semester:";
        String crEdits = "Module Credits:";
        String venUes = "Venue:";

        Intent intentReceived =getIntent();
        if(intentReceived.getIntExtra("C328",0) != 0){
            codee.setText(c0de + " C328");
            names.setText(nAME + "Intelligent Networks");
            years.setText(yeAr + "2022");
            seme.setText(sEmESTERS + "1");
            credits.setText(crEdits + "4");
            venue.setText(venUes + "C328");
        }
        else if(intentReceived.getIntExtra("C331",0) != 0){
            codee.setText(c0de + " C331");
            names.setText(nAME + "Digital Forensics");
            years.setText(yeAr + "2022");
            seme.setText(sEmESTERS + "1");
            credits.setText(crEdits + "4");
            venue.setText(venUes + "C331");
        }
        else if(intentReceived.getIntExtra("C229",0) != 0){
            codee.setText(c0de + " C229");
            names.setText(nAME + "OS and Cloud Computing");
            years.setText(yeAr + "2022");
            seme.setText(sEmESTERS + "1");
            credits.setText(crEdits + "4");
            venue.setText(venUes + "C229");
        }
        else if(intentReceived.getIntExtra("C203",0) != 0){
            codee.setText(c0de + " C203");
            names.setText(nAME + "Web Application Development with PHP");
            years.setText(yeAr + "2022");
            seme.setText(sEmESTERS + "1");
            credits.setText(crEdits + "4");
            venue.setText(venUes + "C203");
        }
        else if(intentReceived.getIntExtra("C346",0) != 0){
            codee.setText(c0de + " C346");
            names.setText(nAME + "Android Development");
            years.setText(yeAr + "2022");
            seme.setText(sEmESTERS + "1");
            credits.setText(crEdits + "4");
            venue.setText(venUes + "C346");
        }
    }
}