package android.bignerdranch.com.sarahvallecustomerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class CustomerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        configureDisplayButton();
        configureNewCustomerButton();
        configuresessionManagerButton();
        configurepaymentButton();
    }

    private void configuresessionManagerButton() {
        Button sessionManagerButton = (Button) findViewById(R.id.sessionManagerButton);
        sessionManagerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CustomerActivity.this, SessionActivity.class));
            }
        });
    }
    private void configurepaymentButton() {
        Button paymentButton = (Button) findViewById(R.id.paymentButton);
        paymentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CustomerActivity.this, PaymentActivity.class));
            }
        });
    }



    private void configureNewCustomerButton() {
        Button newCustomerButton = (Button) findViewById(R.id.newCustomerButton);
        newCustomerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CustomerActivity.this, NewActivity.class));
            }
        });
    }

    private void configureDisplayButton(){
        Button displayButton = (Button) findViewById(R.id.displayButton);
        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CustomerActivity.this, DisplayActivity.class));
            }
        });

    }
 /*   @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.fragment_logoff, menu);
        return true;
    }*/

}
