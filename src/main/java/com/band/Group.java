package com.band;

import java.util.List;

/**
 * Created by Yulya on 18.02.2016.
 */

public class Group {
    List<Musician> musiciant;
    List<Composition> composition;

    public void setMusiciant(List<Musician> musiciant) {
        this.musiciant = musiciant;
    }

    public void setComposition(List<Composition> composition) {
        this.composition = composition;
    }

    public void perform(){
        for(Musician m: musiciant){
            m.playOnInstr();
        }
    }
}

