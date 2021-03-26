package com.example.p0161_dynamiclayout;

import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //створення LinerLayout
        LinearLayout linLayout = new LinearLayout(this);
        //встановлюємо вкртикальну орієнтаію
        linLayout.setOrientation(LinearLayout.VERTICAL);
        //створюємо LayoutLiner
        LinearLayout.LayoutParams linLayoutParam = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
        //встановлюємо linerLayout як кореневй елемент екрану
        setContentView(linLayout, linLayoutParam);

        //Текст
        LinearLayout.LayoutParams lpView = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        TextView tv = new TextView(this);
        tv.setText("TextView");
        tv.setLayoutParams(lpView);
        linLayout.addView(tv);
        //Кнопка 1
        Button btn1 = new Button(this);
        btn1.setText("Button1");
        linLayout.addView(btn1, lpView);
        //Кнопка 2
        LinearLayout.LayoutParams leftMarginParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        leftMarginParams.leftMargin = 50;

        Button btn2 = new Button(this);
        btn2.setText("Button2");
        linLayout.addView(btn2, leftMarginParams);
        //Кнопка 3
        LinearLayout.LayoutParams rightGravityParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        rightGravityParams.gravity = Gravity.RIGHT;

        Button btn3 = new Button(this);
        btn3.setText("Button3");
        linLayout.addView(btn3, rightGravityParams);
    }
//@Override
//public void onCreate(Bundle savedInstanceState) {
//    super.onCreate(savedInstanceState);
//    // создание LinearLayout
//    LinearLayout linLayout = new LinearLayout(this);
//    // установим вертикальную ориентацию
//    linLayout.setOrientation(LinearLayout.VERTICAL);
//    // создаем LayoutParams
//    LinearLayout.LayoutParams linLayoutParam = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
//    // устанавливаем linLayout как корневой элемент экрана
//    setContentView(linLayout, linLayoutParam);
//
//    LinearLayout.LayoutParams lpView = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
//
//    TextView tv = new TextView(this);
//    tv.setText("TextView");
//    tv.setLayoutParams(lpView);
//    linLayout.addView(tv);
//
//    Button btn = new Button(this);
//    btn.setText("Button");
//    linLayout.addView(btn, lpView);
//
//
//    LinearLayout.LayoutParams leftMarginParams = new LinearLayout.LayoutParams(
//            LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
//    leftMarginParams.leftMargin = 50;
//
//    Button btn1 = new Button(this);
//    btn1.setText("Button1");
//    linLayout.addView(btn1, leftMarginParams);
//
//
//    LinearLayout.LayoutParams rightGravityParams = new LinearLayout.LayoutParams(
//            LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
//    rightGravityParams.gravity = Gravity.RIGHT;
//
//    Button btn2 = new Button(this);
//    btn2.setText("Button2");
//    linLayout.addView(btn2, rightGravityParams);
//}
}
