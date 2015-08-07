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
    private TextView smile=null;
    private RadioGroup couleurs=null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        gra = (Button) findViewById(R.id.gra);
        gra.setOnTouchListener(this);
        gra.setOnClickListener(this);

        ital = (Button) findViewById(R.id.ital);
        ital.setOnTouchListener(this);
        ital.setOnClickListener(this);

        souligne= (Button) findViewById(R.id.souligne);
        souligne.setOnTouchListener(this);
        souligne.setOnClickListener(this);
        edition = (EditText) findViewById(R.id.edition);
        edition1 = (TextView) findViewById(R.id.edition1);
        previ = (TextView) findViewById(R.id.previ);
        smile = (TextView) findViewById(R.id.smile);
        couleurs = (RadioGroup) findViewById(R.id.couleurs);
        return ;
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
