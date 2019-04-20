package com.example.booksonsale;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class news extends AppCompatActivity {

    private Button btn_arr1, btn_arr2, btn_arr3, btn_arr4, btn_arr5;//переменные

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
    //кнопки шаблона новости
        btn_arr1 = findViewById(R.id.arr1);//топ 100 книг
        btn_arr2 = findViewById(R.id.arr2);//рецнзии
        btn_arr3 = findViewById(R.id.arr3);//новости
        btn_arr4 = findViewById(R.id.arr4);//рейтинг интернет-магазинов
        btn_arr5 = findViewById(R.id.arr5);//новинки книг

        //нижу пути на внешнии ссылки,и реагирование на нажатие
        btn_arr1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent browserIntent = new
                                Intent(Intent.ACTION_VIEW, Uri.parse("https://readrate.com/rus/ratings/top100"));
                        startActivity(browserIntent);
                    }
                }
        );

         btn_arr2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent browserIntent = new
                                Intent(Intent.ACTION_VIEW, Uri.parse("https://readrate.com/rus/reviews"));
                        startActivity(browserIntent);
                    }
                }
        );

          btn_arr3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent browserIntent = new
                                Intent(Intent.ACTION_VIEW, Uri.parse("https://readrate.com/rus/news"));
                        startActivity(browserIntent);
                    }
                }
        );

           btn_arr4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent browserIntent = new
                                Intent(Intent.ACTION_VIEW, Uri.parse("https://readrate.com/rus/news/nezavisimyy-reyting-knizhnykh-internet-magazinov"));
                        startActivity(browserIntent);
                    }
                }
        );

            btn_arr5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent browserIntent = new
                                Intent(Intent.ACTION_VIEW, Uri.parse("https://readrate.com/rus/news/books"));
                        startActivity(browserIntent);
                    }
                }
        );

    }
}

