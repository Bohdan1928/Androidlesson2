package com.example.p0181_dynamiclayout3;

import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    SeekBar sbWeight;
    Button btn1;
    Button btn2;

    LinearLayout.LayoutParams lParams1;
    LinearLayout.LayoutParams lParams2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sbWeight = (SeekBar) findViewById(R.id.sbWeight);
        sbWeight.setOnSeekBarChangeListener(this);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);

        lParams1 = (LinearLayout.LayoutParams) btn1.getLayoutParams();
        lParams2 = (LinearLayout.LayoutParams) btn2.getLayoutParams();
    }

    //Працює весь час, коли міняється значеня
    @Override
    public void onProgressChanged(
            SeekBar seekBar,
            int progress,
            boolean fromUser) {
        int leftValue = progress;
        int rightValue = seekBar.getMax() - progress;

        //Налаштовуємо вагу
        lParams1.weight = leftValue;
        lParams2.weight = rightValue;

        //В тексті кнопок пишемо значення змінних
        btn1.setText(String.valueOf(leftValue));
        btn2.setText(String.valueOf(rightValue));
    }

    //Спрацьовує, коли пересуваємо повзуок
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    //Спрацьовує, коли відпускаємо повзунок
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
