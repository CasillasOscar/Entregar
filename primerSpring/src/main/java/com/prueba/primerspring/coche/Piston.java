package com.prueba.primerspring.coche;

import org.springframework.stereotype.Component;

@Component
public class Piston {

    private Integer nPistones;
    private String marca;

    public Piston(){
        this.nPistones = 4;
        this.marca = "NGK";
    }


    public Integer getnBielas() {
        return nPistones;
    }

    public void setnBielas(Integer nBielas) {
        this.nPistones = nBielas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Piston{" +
                "nBielas=" + nPistones +
                ", marca='" + marca + '\'' +
                '}';
    }
}
