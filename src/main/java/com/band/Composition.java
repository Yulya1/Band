package com.band;

/**
 * Created by Yulya on 18.02.2016.
 */
//содержит название и текст
public class Composition {
    String text;
    String name;

    public void setText(String text) {
        this.text = text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void NameComp(){
        System.out.println("Name " + name);
    }
    public void TextComp(){
        System.out.println("Text of "+ text);
    }
}
