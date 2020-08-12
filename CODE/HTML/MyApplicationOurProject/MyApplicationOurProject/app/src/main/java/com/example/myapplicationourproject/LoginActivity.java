package com.example.myapplicationourproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText id;
    EditText password;
    Button login;
    DBHelper helper;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        id = (EditText)findViewById(R.id.idText);
        password = (EditText)findViewById(R.id.passwordText);
        login = (Button)findViewById(R.id.loginButton);
        helper = new DBHelper(LoginActivity.this,"student.db",null,3);
        db = helper.getWritableDatabase();
        helper.onCreate(db);

        TextView registerButton = (TextView) findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivityForResult(registerIntent,0);
            }
        });

        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String Id = id.getText().toString().trim();
                String Password = password.getText().toString().trim();

                Cursor cursor = db.query("student",null,
                        null,null,null,
                        null,null,null);

                int var = 0;
                while(cursor.moveToNext()){
                    String compare1 =  cursor.getString(cursor.getColumnIndex("Id"));
                    String compare2 =  cursor.getString(cursor.getColumnIndex("Password"));
                    if(Id.equals(compare1)&&Password.equals(compare2)){
                        var = 1;
                        break;
                    }
                }
                if(var == 1){
                    Toast.makeText(LoginActivity.this,"success",Toast.LENGTH_SHORT).show();
                    Intent successIntent = new Intent(LoginActivity.this, MainActivity.class);
                    LoginActivity.this.startActivity(successIntent);
                }
                else{
                    Toast.makeText(LoginActivity.this,Id + Password + " : fail",Toast.LENGTH_SHORT).show();
                }
                cursor.close();


            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        //helper = new DBHelper(LoginActivity.this,"student.db",null,1);
        //db = helper.getWritableDatabase();
        //helper.onCreate(db);

        if(requestCode==0&&resultCode==RESULT_OK){

            ContentValues values = new ContentValues();
            values.put("Id",data.getStringExtra("Id"));
            values.put("Password",data.getStringExtra("Password"));
            values.put("Email",data.getStringExtra("Email"));
            values.put("Gender",data.getStringExtra("Gender"));
            values.put("Major",data.getStringExtra("Major"));

            db.insert("student",null,values);

            Toast.makeText(LoginActivity.this,"ID : "+data.getStringExtra("Id")
            + "\nEmail : "+data.getStringExtra("Email")
            + "\nGender : "+data.getStringExtra("Gender")
            + "\nMajor : "+data.getStringExtra("Major"),Toast.LENGTH_SHORT).show();
        }
    }


}
