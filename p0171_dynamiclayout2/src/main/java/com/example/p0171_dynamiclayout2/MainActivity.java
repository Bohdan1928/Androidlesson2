package com.example.p0171_dynamiclayout2;

import android.view.Gravity;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout llMain;
    RadioGroup rgGravity;
    EditText etName;
    Button btnClear;
    Button btnCreate;

    int wrapContent = LinearLayout.LayoutParams.WRAP_CONTENT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llMain = (LinearLayout) findViewById(R.id.llMain);
        rgGravity = (RadioGroup) findViewById(R.id.rgGravity);
        etName = (EditText) findViewById(R.id.etName);

        btnCreate = (Button) findViewById(R.id.btnCreate);
        btnCreate.setOnClickListener(this);

        btnClear = (Button) findViewById(R.id.btnClear);
        btnClear.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCreate:
                //Створюю LayOutParams  з шириною та висотою по вмісту
                LinearLayout.LayoutParams lParams = new LinearLayout.LayoutParams(wrapContent, wrapContent);
                // змінна для зберігання значення вирівнювання
                // по замовчуванню буде LEFT
                int btnGravity = Gravity.LEFT;
                // оприділяємо який RadioButton "чекнути"
                // і відповідно заповнюємо btnGravity
                switch (rgGravity.getCheckedRadioButtonId()) {
                    case R.id.rbLeft:
                        btnGravity = Gravity.LEFT;
                        break;
                    case R.id.rbCenter:
                        btnGravity = Gravity.CENTER_HORIZONTAL;
                        break;
                    case R.id.rbRight:
                        btnGravity = Gravity.RIGHT;
                        break;
                }
                // переносимо отримане значення вірівнювання в LayoutParams
                lParams.gravity = btnGravity;

                Button btnNew = new Button(this);
                btnNew.setText(etName.getText().toString());
                llMain.addView(btnNew, lParams);
                break;
            case R.id.btnClear:
                llMain.removeAllViews();
                Toast.makeText(this, "Видалено", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
