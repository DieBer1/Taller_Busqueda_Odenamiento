/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedainsertarposicion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author COMPUMAX
 */
public class Datos 
{
    
    public void cantidadCasos(int n) throws IOException
    {
        try
        {
            String ruta = "cantidadCasos.txt";
            File file = new File("cantidadCasos.txt");
            if(!file.exists())
            {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i=0;i<n;i++)
            {
                int valorEntero = (int) Math.floor(Math.random()*(10000-(-10000)+1)+(-10000));
                bw.write(String.valueOf(valorEntero));
                bw.write("\n");
            }
            bw.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public int[] leerTxt(int arr[]) throws FileNotFoundException, IOException
    {
        try
        {
            File archivo = null;
            FileReader fr = null;
            BufferedReader br = null;
            archivo = new File("CantidadCasos.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            int j = 0;
            while((linea = br.readLine()) != null)
            {
                arr[j] = Integer.parseInt(linea);
                j++;
            }
            Arrays.sort(arr);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return arr;
    }
}
