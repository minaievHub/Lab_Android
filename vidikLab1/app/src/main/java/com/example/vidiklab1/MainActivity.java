package com.example.vidiklab1;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText flower;
    private RadioGroup rg;
    private RadioGroup rg1;
    private Button button1;
    private TextView t1;
    private TextView t2;
    private TextView t3;
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flower = (EditText) findViewById(R.id.flower);
        rg = (RadioGroup) findViewById(R.id.rg);
        rg1 = (RadioGroup) findViewById(R.id.rg1);
        button1 = (Button) findViewById(R.id.button1);
        t1 = (TextView) findViewById(R.id.t1);
        t2 = (TextView) findViewById(R.id.t2);
        t3 = (TextView) findViewById(R.id.t3);
        builder = new AlertDialog.Builder(this);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = flower.getText().toString();
                if (text.length() > 0) {
                    t1.setText(text);
                }
                else{
                    builder.setTitle("Alert!!!")
                            .setMessage("Please fill the text field")
                            .setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.cancel();
                                }
                            })
                            .show();
                }
            }
        });
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i)
                {
                    case R.id.r1:
                        t2.setText(getResources().getString(R.string.white));
                        break;
                    case R.id.r2:
                        t2.setText(getResources().getString(R.string.red));
                        break;
                    case R.id.r3:
                        t2.setText(getResources().getString(R.string.yellow));
                        break;
                }
            }
        });
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i)
                {
                    case R.id.ra:
                        t3.setText(getResources().getString(R.string.grn));
                        break;
                    case R.id.rb:
                        t3.setText(getResources().getString(R.string.grn2));
                        break;
                    case R.id.rc:
                        t3.setText(getResources().getString(R.string.grn3));
                        break;
                }
            }
        });
    }
}