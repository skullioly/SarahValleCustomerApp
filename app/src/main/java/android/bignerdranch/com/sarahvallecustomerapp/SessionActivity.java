package android.bignerdranch.com.sarahvallecustomerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SessionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session);

        configurenewSessionButton();
        configurecompleteSessionButton();
    }

    private void configurecompleteSessionButton() {
        Button completeSessionButton = (Button) findViewById(R.id.completeSessionButton);
        completeSessionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SessionActivity.this, CompleteSessionActivity.class));
            }
        });
    }

    private void configurenewSessionButton() {
        Button newSessionButton = (Button) findViewById(R.id.newSessionButton);
        newSessionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SessionActivity.this, NewSessionActivity.class));
            }
        });
    }
}
