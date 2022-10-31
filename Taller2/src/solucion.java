/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
//package ordenamiento;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class solucion {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here

        Datos d = new Datos();
        BusquedaBinaria bb = new BusquedaBinaria();
        int array[];
        int datosPrueba = 10000;

        if (args.length > 0 && args.length <= 2 && Integer.parseInt(args[0]) > 0 && Integer.parseInt(args[0]) <= 10000 && args[1] != null) {
            array = new int[Integer.parseInt(args[0])];
            d.datosAleatorios(Integer.parseInt(args[0]));
            System.out.println(bb.search(d.leerTxt(array), Integer.parseInt(args[1])));

        } else {
            array = new int[datosPrueba];
            d.datosAleatorios(datosPrueba);
            System.out.println(bb.search(d.leerTxt(array), 8100));
        }
        //d.datosAleatorios(datosPrueba);

    }

}
