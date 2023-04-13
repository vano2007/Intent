package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    // поле кнопки
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // привязка id к полю
        button = findViewById(R.id.button);

        // обработка нажатия кнопки
        button.setOnClickListener(listener);
    }
    // создание слушателя
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // переключение на другой экран
            Intent intent = new Intent(getApplicationContext(), MainActivity.class); // создание намерения переключения на другой экран
            startActivity(intent); // запуск дополнительной активити через намерение
        }
    };
}