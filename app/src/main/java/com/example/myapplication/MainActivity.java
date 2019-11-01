package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button math;
    private EditText editText_C;
    private TextView textView_F;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        math = (Button) findViewById(R.id.button);
        math.setOnClickListener(mathOnClick);
        editText_C =(EditText)findViewById(R.id.editText_C);
        textView_F =(TextView)findViewById(R.id.textView_F);
    }
    private View.OnClickListener mathOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            float ans;
            float temper_C = Float.parseFloat(editText_C.getText().toString());


            ans = temper_C*9/5+32;
            textView_F.setText(String.format("%.1f",ans));

        }
    };


}
