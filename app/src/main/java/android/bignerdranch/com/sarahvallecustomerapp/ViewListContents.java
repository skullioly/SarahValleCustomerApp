package android.bignerdranch.com.sarahvallecustomerapp;

import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ViewListContents extends AppCompatActivity {

    DatabaseHelper customerDB;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        ListView listView = (ListView) findViewById(R.id.ListView);
        customerDB = new DatabaseHelper(this);

        ArrayList<String> custList = new ArrayList<>();
        Cursor data = customerDB.getListContents();

        if(data.getCount() == 0){
            Toast.makeText(ViewListContents.this, "The Database is empty.",Toast.LENGTH_LONG).show();
        }
        else
        {
            while(data.moveToNext()){
                custList.add(data.getString(1));
                ListAdapter listAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,custList);
                listView.setAdapter(listAdapter);
            }
        }
    }
}
