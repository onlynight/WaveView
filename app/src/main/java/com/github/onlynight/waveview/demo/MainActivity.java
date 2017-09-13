package com.github.onlynight.waveview.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.onlynight.waveview.WaveView;

public class MainActivity extends AppCompatActivity {

    private WaveView mWaveView1;
    private WaveView mWaveView2;
    private WaveView mWaveView3;
    private WaveView mWaveView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWaveView1 = (WaveView) findViewById(R.id.waveView1);
        mWaveView2 = (WaveView) findViewById(R.id.waveView2);
        mWaveView3 = (WaveView) findViewById(R.id.waveView3);
        mWaveView4 = (WaveView) findViewById(R.id.waveView4);

        mWaveView1.start();
        mWaveView2.start();
        mWaveView3.start();
        mWaveView4.start();
    }
}
