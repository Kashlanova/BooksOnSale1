package com.example.booksonsale;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class buy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
    }

    //методы для создания кликабельных картинок с ссылками внутри
    public void labi1(View view) {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.labirint.ru/"));
        startActivity(browserIntent);

    };
    public void litr1 (View view) {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.litres.ru/"));
        startActivity(browserIntent);

    };
    public void readcity1(View view) {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.chitai-gorod.ru/"));
        startActivity(browserIntent);
    };
    public void myshop1(View view) {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("https://my-shop.ru/"));
        startActivity(browserIntent);
    };
}
