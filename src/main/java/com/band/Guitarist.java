package com.band;

/**
 * Created by Yulya on 18.02.2016.
 */
public class Guitarist implements Musician {
    public Instrument instrument;

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
    public void playOnInstr(){
        System.out.print("Guitarist play ");
        instrument.play();
    }
}