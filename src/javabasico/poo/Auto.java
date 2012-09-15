package javabasico.poo;

/**
 *
 * @author danmendieta
 */
public class Auto {
    public int modelo;
    public String marca;
    public String nombre;
    public String color;
    public int serie;

    public Auto() {

    }

    public Auto(int modelo, String marca, String nombre, String color, int serie) {
        this.modelo = modelo;
        this.marca = marca;
        this.nombre = nombre;
        this.color = color;
        this.serie = serie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }


}
