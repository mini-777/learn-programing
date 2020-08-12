package com.example.myapplicationourproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class RegisterActivity extends AppCompatActivity {

    private ArrayAdapter adapter;
    private Spinner spinner;
    EditText id;
    EditText password;
    EditText email;
    Button register;
    RadioButton man;
    RadioButton woman;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        spinner=(Spinner) findViewById(R.id.majorSpinner);
        adapter = ArrayAdapter.createFromResource(this, R.array.major, android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        id = (EditText)findViewById(R.id.idText);
        password = (EditText)findViewById(R.id.passwordText);
        email = (EditText)findViewById(R.id.emailText);
        man = (RadioButton)findViewById(R.id.genderMan);
        woman = (RadioButton)findViewById(R.id.genderWoman);
        register = (Button)findViewById(R.id.registerButton);

        register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent outIntent = getIntent();
                outIntent.putExtra("Id",id.getText().toString().trim());
                outIntent.putExtra("Password",password.getText().toString().trim());
                outIntent.putExtra("Email",email.getText().toString().trim());
                if(man.isChecked())
                    outIntent.putExtra("Gender","Man");
                else
                    outIntent.putExtra("Gender","Woman");
                outIntent.putExtra("Major",spinner.getSelectedItem().toString().trim());
                setResult(RESULT_OK,outIntent);
                finish();
            }
        });
    }
}
