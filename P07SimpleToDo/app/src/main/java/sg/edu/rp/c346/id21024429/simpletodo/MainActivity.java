package sg.edu.rp.c346.id21024429.simpletodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etTask;
    Button btnRemove;
    Button btnADD;
    ListView lvTask;
    Button btnRealDel;
    Spinner spn;


    ArrayList<String> alTask;
    ArrayAdapter<String> aaTask;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTask = findViewById(R.id.listViewTask);
        btnRemove = findViewById(R.id.buttonClear);
        btnADD = findViewById(R.id.buttonAdd);
        etTask = findViewById(R.id.editTextTask);
        spn = findViewById(R.id.spinner);
        btnRealDel = findViewById(R.id.buttonDelete);
        alTask = new ArrayList<String>();
        alTask.add("Watch Movies with Jeremy");
        alTask.add("Buy Groceries for Mom");
        aaTask = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, alTask);
        lvTask.setAdapter(aaTask);


        btnRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alTask.clear();
                aaTask.notifyDataSetChanged();
            }
        });

        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,int position , long id) {
                if(position == 0) {
                    etTask.setHint("Type in a new task here");
                    btnRealDel.setEnabled(false);
                    btnADD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String editTask = etTask.getText().toString();
                            alTask.add(editTask);
                            aaTask.notifyDataSetChanged();
                            etTask.getText().clear();
                        }

                    });
                }else if(position == 1){
                        etTask.setHint("Type in the index of the task to be removed");
                        btnADD.setEnabled(false);
                        int pos = Integer.parseInt(etTask.getText().toString());
                        btnRealDel.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                alTask.remove(pos);
                                aaTask.notifyDataSetChanged();
                                etTask.getText().clear();

                            }
                        });

                }

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}