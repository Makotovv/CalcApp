package jp.techacademy.makoto.kaneko.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

//        int value1 = intent.getIntExtra("VALUE1", 0);
//        int value2 = intent.getIntExtra("VALUE2", 0);
        double value1 = intent.getIntExtra("VALUE1", 0);
        double value2 = intent.getIntExtra("VALUE2", 0);
        int hikaku = intent.getIntExtra("hikaku", 0);


        double anser = 0;
//        double doublebalue1 = Double.valueOf(value1);
//        double doublebalue2 = Double.valueOf(value2);
        String anserText = "";


        if (hikaku == 1) {
            anser = value1 + value2;
            anserText=String.valueOf(anser);
        } else if (hikaku == 2) {
            anser = value1 - value2;
            anserText=String.valueOf(anser);
        } else if (hikaku == 3) {
            anser = value1 * value2;
            anserText=String.valueOf(anser);
        } else if (hikaku == 4) {
            if (value2 == 0) {
                anserText = "計算不可";
            } else {
                anser = value1 / value2;
                anserText = String.valueOf(anser);
            }
        }

            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(anserText);

    }
}



