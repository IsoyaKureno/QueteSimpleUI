package com.example.apprenti.quetesimpleui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox maCheckBox = (CheckBox)findViewById(R.id.CheckBox);
        maCheckBox.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                EditText edit4 = (EditText)findViewById(R.id.editText4);
                EditText edit5 = (EditText)findViewById(R.id.editText5);
                Button button = (Button)findViewById(R.id.button);

                if (((CheckBox) v).isChecked()) {

                    edit4.setEnabled(true);
                    edit5.setEnabled(true);
                    button.setEnabled(true);
                }
                else
                {
                    edit4.setEnabled(false);
                    edit5.setEnabled(false);
                    button.setEnabled(false);
                }
            }
        });

        Button monBouton = (Button)findViewById(R.id.button);
        monBouton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                EditText edit4 = (EditText)findViewById(R.id.editText4);
                EditText edit5 = (EditText)findViewById(R.id.editText5);

                if(edit4.getText().toString().trim().length() == 0 || edit5.getText().toString().trim().length() == 0) {
                    Toast.makeText(MainActivity.this,"Tu dois renseigner le nom et le prénom !",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    TextView textView = (TextView)findViewById(R.id.textView);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("Félicitations, " + edit4.getText() + " " + edit5.getText() + "!");
                }
            }
        });

    }
}