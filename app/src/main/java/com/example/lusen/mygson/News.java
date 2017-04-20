package com.example.lusen.mygson;

import com.google.gson.Gson;

/**
 * Created by lusen on 2017/4/19.
 */

public class News {

    /**
     * id : 100
     * body : It is my post
     * number : 13
     * created_at : 2014-05-22 19:12:38
     */

    private int id;
    private String body;
    private int number;
    private String created_at;

    public static News objectFromData(String str) {

        return new Gson().fromJson(str, News.class);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
