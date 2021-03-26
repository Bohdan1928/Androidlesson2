package com.example.p0141_menuadv;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    CheckBox chb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.textView);
        chb = (CheckBox) findViewById(R.id.chbExtMenu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //  добавляємо пункти меню
        getMenuInflater().inflate(R.menu.mymenu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    //оновлення меню(Викликається кожен раз перед відображеня меню)
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        //пункти меню з ID-групи = 1 показує, якщо в CheckBox стоїть галочка
        menu.setGroupVisible(1, chb.isChecked());
        return super.onPrepareOptionsMenu(menu);
    }

    //обробка натискання(викликається при натисканні пункта меню)
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        StringBuilder sb = new StringBuilder();

        //Виведемо в TextView інформацію про натиснутий пункт меню
        sb.append("Item Menu");
        sb.append("/r/n groupId: " + String.valueOf(item.getGroupId()));
        sb.append("/r/n itemId" + String.valueOf(item.getItemId()));
        sb.append("/r/n order: " + String.valueOf(item.getOrder()));
        sb.append("/r/n title: " + String.valueOf(item.getTitle()));
        tv.setText(sb.toString());
        return super.onOptionsItemSelected(item);
    }
}
