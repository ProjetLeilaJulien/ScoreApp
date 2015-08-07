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
import android.widget.TextView;
import android.widget.Toast;

// Notre activité détectera les touchers et les clics sur les vues qui se sont inscrites
public class MainActivity extends Activity implements View.OnTouchListener, View.OnClickListener {
 /*   private Button raz = null;
    private EditText tv1 = null;
    private EditText tv2 = null;
    private TextView tv3 = null;
    private CharSequence t1 = null;
    private CheckBox cb = null;
*/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
/*
        raz = (Button) findViewById(R.id.raz);
        raz.setOnTouchListener(this);
        raz.setOnClickListener(this);
        tv1 = (EditText) findViewById(R.id.poids);
        tv2 = (EditText) findViewById(R.id.taille);
        tv3 = (TextView) findViewById(R.id.result);
        t1 = tv3.getText();
        cb = (CheckBox) findViewById(R.id.mega);
*/
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
