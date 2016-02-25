package com.band;

/**
 * Created by Yulya on 18.02.2016.
 */

//одновременно играет на инструменте и декламирует текст вместе с вокалистом (использовать SpEL)
public class SingingMisician implements Musician {
    Instrument instrument;

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public void playOnInstr(){
        System.out.println("SingingMisician play  ");
        instrument.play();
    }

}
