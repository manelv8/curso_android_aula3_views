package com.givapp404.curso_aula3_views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cliqueDoBotao(View view) {

        Toast.makeText(this,"metodo 1 ok",Toast.LENGTH_SHORT).show();

    }

    public void irParaTela2(View view) {
        Intent i = new Intent(this,Method2Activity.class);
        startActivity(i);
    }
}
