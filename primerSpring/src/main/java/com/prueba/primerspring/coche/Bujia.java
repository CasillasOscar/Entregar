package com.prueba.primerspring.coche;

import org.springframework.stereotype.Component;

@Component
public class Bujia {

    private Integer nBujias;
    private String marca;

    public Bujia(){
        this.nBujias = 4;
        this.marca = "NISU";
    }

    public Integer getnBujias() {
        return nBujias;
    }

    public void setnBujias(Integer nBujias) {
        this.nBujias = nBujias;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Bujia{" +
                "nBujias=" + nBujias +
                ", marca='" + marca + '\'' +
                '}';
    }
}
