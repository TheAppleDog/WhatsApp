package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class verify extends AppCompatActivity {
EditText code;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
        btn = findViewById(R.id.btn);
        code = findViewById(R.id.code);

        final ProgressBar progressBar = findViewById(R.id.pb2);
        if (progressBar != null) {
            final Button btn = findViewById(R.id.btn);
            if (btn != null) {
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (code.getText().toString().equals("888888")) {

                            int visibility = (progressBar.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
                            progressBar.setVisibility(visibility);

                            String btnText = (progressBar.getVisibility() == View.GONE) ? "VERIFY" : "VERIFIED";
                            btn.setText(btnText);
                            Intent intent = new Intent(getApplicationContext(), profile.class);
                            startActivity(intent);
                        } else {
                            Toast.makeText(getApplicationContext(), "CODE INCORRECT", Toast.LENGTH_LONG).show();
                        }
                    }


                });
            }
        }
    }
}