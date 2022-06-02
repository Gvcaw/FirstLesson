package sg.edu.rp.c346.id21024429.mylocalbanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnDBS;
    Button btnOCBank;
    Button btnUOB;

    String btnClicked = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDBS = findViewById(R.id.buttonDBS);
        btnOCBank = findViewById(R.id.buttonOCBC);
        btnUOB = findViewById(R.id.buttonUOB);

        registerForContextMenu(btnDBS);
        registerForContextMenu(btnOCBank);
        registerForContextMenu(btnUOB);


    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0, 0, 0, "Website");
        menu.add(0, 1, 1, "Contact the Bank");


        if (v == btnDBS) {
            btnClicked = "dbs";
        } else if (v == btnOCBank) {
            btnClicked = "OCBank";
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (btnClicked.equalsIgnoreCase("dbs")) {
            if (item.getItemId() == 0) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dbs.com"));
                startActivity(intent);

            } else if (item.getItemId() == 1) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + 18001111111L));
                startActivity(intentCall);
            }
        }
        if (btnClicked.equalsIgnoreCase("OCBank")) {
            if (item.getItemId() == 0) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ocbc.com"));
                startActivity(intent);

            } else if (item.getItemId() == 1) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + 18003633333L));
                startActivity(intentCall);
            }
        }
        if (btnClicked.equalsIgnoreCase("uob")) {
            if (item.getItemId() == 0) {

            } else if Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uob.com"));
            startActivity(intent);(item.getItemId() == 1) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + 18002266121L));
                startActivity(intentCall);
            }
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();
        if (id == R.id.EnglishSelection) {
            btnDBS.setText("DBS");
            btnOCBank.setText("OCBC");
            btnUOB.setText("UOB");
            return true;
        } else if (id == R.id.ChineseSelection) {
            btnDBS.setText("星展银行");
            btnOCBank.setText("华侨银行");
            btnUOB.setText("大华银行");
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

