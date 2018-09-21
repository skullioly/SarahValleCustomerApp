package android.bignerdranch.com.sarahvallecustomerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {

    DatabaseHelper customerDB;
    Button btnAdd, btnView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        editText = (EditText) findViewById(R.id.editText);
        btnAdd = (Button) findViewById(R.id.saveCustomer);
        btnView = (Button) findViewById(R.id.displayButton);
        customerDB = new DatabaseHelper(this);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newEntry = editText.getText().toString();
                if(editText.length() != 0){
                    AddData (newEntry);
                    editText.setText("");
                }
                else{
                    Toast.makeText(NewActivity.this, "You must enter a customer name.", Toast.LENGTH_LONG).show();
                }

            }
        });

        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DisplayActivity.this,ViewListContents.class);
                startActivity(intent);
            }
        });

    }

    public void AddData(String newEntry){
        boolean insertData = customerDB.addData(newEntry);

        if(insertData==true){
            Toast.makeText(NewActivity.this,"Successfully added customer!",Toast.LENGTH_LONG).show();
            }
            else
        {
            Toast.makeText(NewActivity.this, "There was an error with your entry!", Toast.LENGTH_LONG).show();
        }
    }
}
