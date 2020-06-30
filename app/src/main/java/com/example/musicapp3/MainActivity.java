package com.example.musicapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_play,btn_pause,btn_previous,btn_next;
    TextView songNameView;
    SeekBar seekbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_play=(Button)findViewById(R.id.play);
        btn_next=(Button)findViewById(R.id.next);
        btn_previous=(Button)findViewById(R.id.previous);
        songNameView=(TextView)findViewById(R.id.songName);
        seekbar=(SeekBar)findViewById(R.id.seekBar);

    }
}
