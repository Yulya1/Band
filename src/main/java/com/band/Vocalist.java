package com.band;

/**
 * Created by Yulya on 18.02.2016.
 */
//декламирует текст произведения
public class Vocalist implements Musician {
    public void recite(){
        System.out.println("Vocalist recite text of composition");
    }

    @Override
    public void playOnInstr() {
        System.out.println("Vocalist doesn't play on instrument");
        recite();
    }
}
