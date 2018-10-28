package jp.techacademy.makoto.kaneko.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttontasu = (Button) findViewById(R.id.tasu);
        buttontasu.setOnClickListener(this);

        Button buttonhiku = (Button) findViewById(R.id.hiku);
        buttonhiku.setOnClickListener(this);

        Button buttonkakeru = (Button) findViewById(R.id.kakeru);
        buttonkakeru.setOnClickListener(this);

        Button buttonwaru = (Button) findViewById(R.id.waru);
        buttonwaru.setOnClickListener(this);

        editText1 = (EditText) findViewById(R.id.textEdit1);
        editText2 = (EditText) findViewById(R.id.textEdit2);

    }

    @Override
    public void onClick(View v) {

        int hikaku = 0 ;
        if(v.getId() == R.id.tasu){
            hikaku=1;
        }else if (v.getId() == R.id.hiku){
            hikaku=2;
        }else if (v.getId() == R.id.kakeru){
            hikaku=3;
        }else if (v.getId() == R.id.waru){
            hikaku=4;
        }

        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("VALUE1",editText1.getText().toString());
        intent.putExtra("VALUE2",editText2.getText().toString());
        intent.putExtra("hikaku",hikaku);

        startActivity(intent);

    }
}
