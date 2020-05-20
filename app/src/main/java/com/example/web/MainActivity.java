package com.example.web;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {

    NumberPicker possiblities;
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        possiblities = findViewById(R.id.numberPicker);
        web = findViewById(R.id.ToView);

        String[] possibilitiesString = {
                "Dog",
                "Cat",
                "Cow",
                "Ox",
                "Lion",
                "Tiger"
        };
        possiblities.setDisplayedValues(possibilitiesString);
        possiblities.setMinValue(0);
        possiblities.setMaxValue(possibilitiesString.length - 1);
    }

    public void navigate(View view) {

        int choice = possiblities.getValue();
        if (choice == 0) {
            web.setWebViewClient(new WebViewClient());
            web.loadUrl("https://en.wikipedia.org/wiki/Dog");
        }
        else if (choice == 1)
            web.loadUrl("https://en.wikipedia.org/wiki/Cat");
        else if (choice == 2)
            web.loadUrl("https://en.wikipedia.org/wiki/Cattle");
        else if (choice == 3)
            web.loadUrl("https://en.wikipedia.org/wiki/Ox");
        else if (choice == 4)
            web.loadUrl("https://en.wikipedia.org/wiki/Lion");
        else if (choice == 5)
            web.loadUrl("https://en.wikipedia.org/wiki/Tiger");



    }


}
