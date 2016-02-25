package com.band;

/**
 * Created by Yulya on 18.02.2016.
 */
public class BasGuitarist implements Musician{
    Instrument instrument;

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public void playOnInstr(){
        System.out.print("BasGuitarist play ");
        instrument.play();
    }
}
