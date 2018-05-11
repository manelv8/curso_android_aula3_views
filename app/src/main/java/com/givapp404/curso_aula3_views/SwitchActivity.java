package com.givapp404.curso_aula3_views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class SwitchActivity extends AppCompatActivity {

    Switch mySwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);
        //#1 - Faça o bind do switch para a variável mySwitch


        //#2 - use mySwitch.setOnCheckedChangeListener para verificar quando o botao foi ligado ou desligado
        // mostre um Toast informando o status ligado ou desligado

    }
}
