package sg.edu.rp.c346.id21024429.p07demodynamiclistviewcolourlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText etColour;
    Button btnAdd;
    ListView lvColour;
    ArrayList<String> alColours;
    ArrayAdapter<String> aaColour;
    EditText etIndexElement;
    Button btnUp;
    Button btnRem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etColour = findViewById(R.id.editTextColour);
        btnAdd = findViewById(R.id.buttonAddItem);
        lvColour = findViewById(R.id.listViewColour);
        etIndexElement = findViewById(R.id.editTextIndex);
        btnUp = findViewById(R.id.buttonUp);
        btnRem = findViewById(R.id.buttonRem);
        alColours= new ArrayList<String>();
        alColours.add("Red");
        alColours.add("Orange");
        aaColour = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,alColours);
        lvColour.setAdapter(aaColour);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editColour = etColour.getText().toString();
                int pos = Integer.parseInt(etIndexElement.getText().toString());
                alColours.add(pos,editColour);
                aaColour.notifyDataSetChanged();

            }

        });

        lvColour.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String colorChose = alColours.get(position);
                Toast.makeText(MainActivity.this,"You picked the colour: " + colorChose, Toast.LENGTH_SHORT).show();
            }
        });

        btnRem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = Integer.parseInt(etIndexElement.getText().toString());
                alColours.remove(pos);
                aaColour.notifyDataSetChanged();

            }

        });

        btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editColour = etColour.getText().toString();
                int pos = Integer.parseInt(etIndexElement.getText().toString());
                alColours.set(pos,editColour);
                aaColour.notifyDataSetChanged();

            }

        });
    }

}