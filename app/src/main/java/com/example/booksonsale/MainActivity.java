package com.example.booksonsale;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_buy, btn_sale,btn_news, btn_info, btn_alert; //переменные кнопок

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();

    }
    //создадим метод для обработчика нажатий(кнопки)
    public void addListenerOnButton() {
        //присваиваем переменным функционал кнопок и указываем их id в классе maainctivity.xml
        btn_buy = findViewById(R.id.arr1);//переход на страницу купить
        btn_sale = findViewById(R.id.arr2);//переход на страницу скидки
        btn_info = findViewById(R.id.btn4);//переход на страницу о приложении
        btn_news = findViewById(R.id.btn3);//переход на страницу новости
        btn_alert = findViewById(R.id.alert);//кнопка закрытия приложения

        //ниже указываются имена шаблонов для перехода на них
        btn_buy.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    //осуществляем кнопку для перехода на второй шаблон по нажатию
                    public void onClick(View v) {
                        Intent intent = new Intent(".buy");
                        startActivity(intent);

                    }
                }
        );

        btn_sale.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    //осуществляем кнопку для перехода на второй шаблон по нажатию
                    public void onClick(View v) {
                        Intent intent = new Intent(".sale");
                        startActivity(intent);

                    }
                }
        );

        btn_info.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    //осуществляем кнопку для перехода на второй шаблон по нажатию
                    public void onClick(View v) {
                        Intent intent = new Intent(".inform");
                        startActivity(intent);

                    }
                }
        );

        btn_news.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    //осуществляем кнопку для перехода на второй шаблон по нажатию
                    public void onClick(View v) {
                        Intent intent = new Intent(".news");
                        startActivity(intent);

                    }
                }
        );

        //делаем кнопку выхода из приложения
        btn_alert.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //всплывающее окно с сообщением
                        AlertDialog.Builder a_builder = new AlertDialog.Builder(MainActivity.this);
                        a_builder.setMessage("Вы хотите закрыть приложение?")
                                .setCancelable(false)
                                //позитивный ответ,то етсь закрываем
                                .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        finish();
                                    }
                                })
                                //отмена открытия,при нажатии нет происходит закрытие диалога
                                .setNegativeButton("Нет", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();

                                    }
                                });
                        //вспылвающее окно в нижней части экрана при закрытии
                        AlertDialog alert = a_builder.create();
                        alert.setTitle("Закрытие приложения");
                        alert.show();
                    }
                }
        );
    }
}
