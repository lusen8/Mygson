package com.example.lusen.mygson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String response = "[{\n" +
                "    \"id\": 100,\n" +
                "    \"body\": \"It is my post\",\n" +
                "    \"number\": 13,\n" +
                "    \"created_at\": \"2014-05-22 19:12:38\"\n" +
                "}]";
       ArrayList <News> list= (ArrayList<News>) MyGsonUtil.getObjectList(response,News.class);
        Log.d("Mantivity::",list.get(0).getBody());

    }
}
