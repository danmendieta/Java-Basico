package javabasico;

import java.util.ArrayList;
import javabasico.poo.Auto;

/*
 * @author danmendieta
 */
public class Main {
    static Auto arregloAutos[] = new Auto[5];
    
    static ArrayList<Auto> listaAutos = new ArrayList<Auto>();

    public static void main(String[] args) {
        //Genera objetos fijos en Arreglo de Autos
        arregloAutos[0] = new Auto(2012, "Mazda", "Touring i", "Negro", 6);
        arregloAutos[1] = new Auto(2002, "Tsuru", "Sedan", "Blanco", 1);
        arregloAutos[2] = new Auto(2012, "Jetta", "Clasico", "Gris", 2);
        arregloAutos[3] = new Auto(2012, "Bora", "Sport", "Azul", 1);
        arregloAutos[4] = new Auto(2012, "Clio", "Clasico", "Dorado", 4);        
        llenaLista(arregloAutos);
        System.out.println("Autos pares:" + listaAutos.size());
        System.out.println("Marcas Pares:");
        for(int a=0; a<listaAutos.size(); a++){
            System.out.println("  "+listaAutos.get(a).getMarca());
        }
    }

    public static void llenaLista(Auto[] arregloAutos){//Lena en ArrayList los autos pares
        int size= arregloAutos.length;
        for(int a = 0 ;a < size;a++){
            listaAutoPar(arregloAutos[a]);
            a++;
        }
    }

    public static ArrayList listaAutoPar(Auto carro){
        listaAutos.add(carro);
        return listaAutos;
    }

}
