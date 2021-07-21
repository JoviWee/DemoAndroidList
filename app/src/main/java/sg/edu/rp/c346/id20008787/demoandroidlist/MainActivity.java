package sg.edu.rp.c346.id20008787.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<AndroidVersion> al;
    ArrayAdapter<AndroidVersion> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);
        al = new ArrayList<>();

        AndroidVersion av1 = new AndroidVersion("Pie" , "9.0");
        AndroidVersion av2 = new AndroidVersion("Oreo", "8.0");
        AndroidVersion av3 = new AndroidVersion("Nougat", "7.0");
        AndroidVersion av4 = new AndroidVersion("Marshmellow", "6.0");
        al.add(av1);
        al.add(av2);
        al.add(av3);
        al.add(av4);

        //aa = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,al);
        CustomAdapter adapter = new CustomAdapter(MainActivity.this, R.layout.row, al);
        lv.setAdapter(adapter);


    }
}