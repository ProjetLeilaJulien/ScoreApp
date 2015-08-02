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
    private Button raz = null;
    private EditText tv1 = null;
    private EditText tv2 = null;
    private TextView tv3 = null;
    private CharSequence t1 = null;
    private CheckBox cb = null;

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
       /* Réagir au toucher */
        return false;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            // Si l'identifiant de la vue est celui du premier bouton
            case R.id.raz:
                tv1.getEditableText().clear();
                tv2.getEditableText().clear();// donne valeur
                tv3.setText(t1);
                cb.setChecked(false);// change valeur
                Toast.makeText(getBaseContext(), "remise à zéro", Toast.LENGTH_SHORT).show();
    /* Agir pour bouton 1 */
                break;

            // Si l'identifiant de la vue est celui du deuxième bouton
            case R.id.calcul:
                float t1 = Float.parseFloat(tv1.getText().toString());
                float t2 = Float.parseFloat(tv2.getText().toString());
                float indiceIMC = (t1) / (t2 * t2);
                tv3.setText(String.valueOf(indiceIMC));
                if (cb.isChecked())//renvoit booléen

                    break;


        }
    }
}
