package com.example.p0121_logandmess;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    private static final String TAG = "myLog";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "найдемо View-елементи");
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        Log.d(TAG, "присвоюємо кнопкам обробник");
        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.d(TAG, "по id оприділяємо кнопку, яка викликала це обробник");
        switch (v.getId()){
            case R.id.btnOk:
                Log.d(TAG, "кнопка ОК");
                tvOut.setText("Нажата кнопка ОК");
                Toast.makeText(this, "Нажата кнопка OK", Toast.LENGTH_LONG).show();
                break;
            case R.id.btnCancel:
                Log.d(TAG, "кнопка Cancel");
                tvOut.setText("Нажата кнопка CANCEL");
                Toast.makeText(this, "Нажата кнопка Cancel", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
