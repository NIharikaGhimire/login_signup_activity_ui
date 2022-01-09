package com.example.shared_preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    Button sign_up;
    EditText email, password;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        sign_up=findViewById(R.id.btn_5);
        email = findViewById(R.id.edit_text1);
        password = findViewById(R.id.edit_text_3);

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String emailnew = email.getText().toString();
                String passnew = password.getText().toString();
                SharedPreferences sp = getSharedPreferences("abc", Context.MODE_PRIVATE);
                SharedPreferences.Editor ed = sp.edit();
                ed.putString("email", emailnew);
                ed.putString("pass", passnew);
                ed.apply();

                Intent i = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(i);


            }
        });
    }
}
