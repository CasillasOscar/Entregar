package com.prueba.primerspring.coche;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Motor {

    private Piston piston;
    private Bujia bujia;

    @Autowired
    public  Motor(Piston piston, Bujia bujia){
        this.piston = piston;
        this.bujia = bujia;
    }

    public Bujia getBujia() {
        return bujia;
    }

    public void setBujia(Bujia bujia) {
        this.bujia = bujia;
    }

    public Piston getPiston() {
        return piston;
    }

    public void setPiston(Piston piston) {
        this.piston = piston;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "piston=" + piston +
                ", bujia=" + bujia +
                '}';
    }
}
