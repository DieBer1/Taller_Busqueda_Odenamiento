/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedainsertarposicion;
import busquedainsertarposicion.Busqueda;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author COMPUMAX
 */
public class Main 
{
    public static void main(String [] args) throws IOException
    {
        Busqueda b = new Busqueda();
        Datos d = new Datos();
        int array[];
        int casosPrueba = 10000;
        
        if(args.length > 0 && args.length<=2 && Integer.parseInt(args[0]) > 0 && Integer.parseInt(args[0]) <= 10000 && args[1] != null)
        {
            array = new int [Integer.parseInt(args[0])];
            d.cantidadCasos(Integer.parseInt(args[0]));
            System.out.println(b.searchInsert(d.leerTxt(array), Integer.parseInt(args[1])));
        }
        
        else
        {
            array = new int [casosPrueba];
            d.cantidadCasos(casosPrueba);
            System.out.println(b.searchInsert(d.leerTxt(array), 1000));
        }
    }
    
    
        
    /*
    try
        {
            int pruebas = 0;
            int i = 0;
            int numDatos = 0;
            int target = 0;
            if(args.length > 0)
            {
                pruebas = Integer.parseInt(args[0]);
            }
            else
            {
                Scanner leer = new Scanner(System.in);
                System.out.println("Digite la cantidad de pruebas");
                pruebas = leer.nextInt();
            }
            System.out.println(i);
            while(i < pruebas)
            {
                System.out.println(i);
                if(args.length == 2)
                {
                    numDatos = Integer.parseInt(args[1]);
                }
                else numDatos = (int) Math.floor(Math.random()*(10000-(-10000)+1)+(-10000));
                Datos d = new Datos();
                Busqueda b = new Busqueda();
                int arr[];
                arr = new int[numDatos];
                d.cantidadCasos(numDatos);
                System.out.println("Caso: "+(i+1));
                System.out.println("El arreglo es: \n" + Arrays.toString(d.leerTxt(arr)));
                i++;
                
            }
        }
        catch(Exception e)
        {
            System.out.println("Existe algun dato mal digitado, por favor vuelva a intentarlo");
        }
        */
}
