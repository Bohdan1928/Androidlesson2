package com.example.p0101listener;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tvOut = (TextView) findViewById(R.id.tvOut);
        final Button btnOk = (Button) findViewById(R.id.btnOk);
        Button btnCancel = (Button) findViewById(R.id.btnCancel);

        View.OnClickListener oclBtn = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.btnOk:
                        tvOut.setText("Pressed button OK");
                        break;
                    case R.id.btnCancel:
                        tvOut.setText("Pressed button CANCEL");
                        break;
                }
            }
        };
                btnOk.setOnClickListener(oclBtn);
                btnCancel.setOnClickListener(oclBtn);
    }
}
