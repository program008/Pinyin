package com.unisrobot.pinyin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.unisrobot.polyphonelibrary.PinyinSimilarity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String output = new PinyinSimilarity(true).changeOurWordsWithPinyin("同音字");
    }
}
