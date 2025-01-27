package com.prueba.primerspring.coche;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Coche {

    private String marca;
    private String color;
    private Integer peso;
    private Motor motor;

    public Coche(){};

    @Autowired
    public Coche(Motor motor){
        this.marca = "BMW";
        this.color = "Negro";
        this.peso = 1200;
        this.motor = motor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                ", motor=" + motor +
                '}';
    }
}
