package com.example.arad_sheybak.listview;

/**
 * Created by arad on 7/23/2017.
 */

public class Drink {
    private String name;
    private String description;
    private int img;
    public static final Drink[] drinks={
      new Drink("Latte","یک نوشیدنی خوب",   R.drawable.latte),
            new Drink("cappuccino","اینم ی نوشیدنی عالی!",R.drawable.cop),
            new Drink("Filter"," این یکی خیلی خوبه!!!",R.drawable.esp)
    };

    public Drink(String name, String description, int img) {
        this.name = name;
        this.description = description;
        this.img = img;
    }
    public String getDescription(){
        return description;
    }
    public String getName(){
        return name;
    }
    public int getImg(){
        return img;
    }
    public String toString(){
        return this.name;
    }
}