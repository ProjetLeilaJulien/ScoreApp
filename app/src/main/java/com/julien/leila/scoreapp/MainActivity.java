package com.julien.leila.scoreapp;


import android.support.annotation.Nullable;
import android.text.Editable;
import android.view.View.OnTouchListener;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

// Notre activité détectera les touchers et les clics sur les vues qui se sont inscrites
public class MainActivity extends Activity implements View.OnTouchListener, View.OnClickListener {
    private Button gra = null;
    private Button ital = null;
    private Button souligne=null;
    private Button cache=null;
    private EditText edition = null;
    private TextView edition1 = null;
    private TextView previ = null;
    private RadioGroup couleurs=null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        raz = (Button) findViewById(R.id.raz);
        raz.setOnTouchListener(this);
        raz.setOnClickListener(this);
        tv1 = (EditText) findViewById(R.id.poids);
        tv2 = (EditText) findViewById(R.id.taille);
        tv3 = (TextView) findViewById(R.id.result);
        t1 = tv3.getText();
        cb = (CheckBox) findViewById(R.id.mega);

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
       // Réagir au toucher
        return false;
    }

    @Override
    public void onClick(View v) {

    }
}
