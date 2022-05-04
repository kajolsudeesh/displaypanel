package com.example.parkingareadisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class otp_verification extends AppCompatActivity {
      private Button opendoor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verification);
        opendoor =findViewById(R.id.opendoor);
        opendoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(otp_verification.this, loading_items.class);
                startActivity(intent);
            }
        });
    }
}

