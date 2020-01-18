package com.example.akashnishad.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usr,pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnClickMe(View v)
    {
        usr = (EditText) findViewById(R.id.editText4);
        pwd = (EditText) findViewById(R.id.editText3);
        String user = usr.getText().toString();
        String pass = pwd.getText().toString();
        if(user.equals("admin") && pass.equals("admin@123"))
        {
            Intent its = new Intent(MainActivity.this,Hello.class);
            startActivity(its);
        }
        else
        {
            Toast.makeText(MainActivity.this, "Invaild User", Toast.LENGTH_SHORT).show();
        }

    }
}
