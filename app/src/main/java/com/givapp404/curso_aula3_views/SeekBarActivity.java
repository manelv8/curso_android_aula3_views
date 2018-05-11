package com.givapp404.curso_aula3_views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;

public class SeekBarActivity extends AppCompatActivity {

    private static final String TAG = "meuApp";
    SeekBar seekbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);

        seekbar = findViewById(R.id.seekbar);

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.d(TAG,"VALOR ATUAL: " + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.d(TAG,"VOCE ESTÁ SEGURANDO O SEEKBAR");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.d(TAG,"VOCE SOLTOU O SEEKBAR");
            }
        });
    }

    public void goToChallenge(View view) {
        Intent i = new Intent(this,SwitchActivity.class);
        startActivity(i);
    }
}
