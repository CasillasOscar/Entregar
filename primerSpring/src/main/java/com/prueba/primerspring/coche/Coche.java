package com.prueba.primerspring.coche;

public class Coche {

    String marca;
    String color;
    Integer peso;

    public Coche(){};

    public Coche(String marca, String color, Integer peso){
        this.marca = marca;
        this.color = color;
        this.peso = peso;
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
                '}';
    }
}
