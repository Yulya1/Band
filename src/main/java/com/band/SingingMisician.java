package com.band;

/**
 * Created by Yulya on 18.02.2016.
 */


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
