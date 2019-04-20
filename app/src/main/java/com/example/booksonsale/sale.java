package com.example.booksonsale;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sale);
    }
    //ниже представлены обработчики нажатий и переход на указанные ссылки с помощью браузера
    public void labis1(View view) {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.labirint.ru/biblionight/"));
        startActivity(browserIntent);

    };
    public void litrs1 (View view) {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.litres.ru/kollekcii-knig/skidka-50-na-ves-assortiment-biblos-pretekst-evrobuks/"));
        startActivity(browserIntent);

    };
    public void readcitys1(View view) {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.chitai-gorod.ru/events/biblionight/"));
        startActivity(browserIntent);
    };
    public void myshops1(View view) {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("https://my-shop.ru/shop/promo/3642/sort/a/page/1.html"));
        startActivity(browserIntent);
    };
}
