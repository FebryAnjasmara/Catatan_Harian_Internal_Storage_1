package com.example.catatanharianinternalstorage1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name, pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.etName);
        pass = findViewById(R.id.etPass);
        login = findViewById(R.id.btLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkLogin();
            }
        });
    }

    private void checkLogin(){
        if (name.getText().toString().equals("febry") && pass.getText().toString().equals("12345asd")){
            Toast.makeText(this, "Berhasil Login", Toast.LENGTH_LONG).show();
            Intent goDairy = new Intent(MainActivity.this, CatatanHarian.class);
            startActivity(goDairy);
        } else if (name.getText().toString().equals("") || pass.getText().toString().equals("")){
            Toast.makeText(this, "Masukkan username dan password", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Username atau password anda salah, silahkan coba lagi",
                    Toast.LENGTH_SHORT).show();
        }
    }
}