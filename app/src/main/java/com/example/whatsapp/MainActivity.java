package com.example.whatsapp;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
EditText et1;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.et1);
        builder = new AlertDialog.Builder(this);

        final ProgressBar progressBar = findViewById(R.id.pb);
        if (progressBar != null) {
            final Button btn=findViewById(R.id.btn);
            if (btn != null) {
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        builder.setTitle("You entered the phone number:\n"+ et1.getText().toString());
                        builder.setMessage("is this OK, or would you like to edit the number?");
                        builder.setCancelable(false);
                        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                int visibility = (progressBar.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
                                progressBar.setVisibility(visibility);

                                String btnText = (progressBar.getVisibility() == View.GONE) ? "NEXT" : "NEXT";
                                btn.setText(btnText);
                                Intent intent=new Intent(getApplicationContext(),verify.class);
                                startActivity(intent);

                            }
                        });
                        builder.setNegativeButton("EDIT", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                    }
                });

            }
        }
    }
}