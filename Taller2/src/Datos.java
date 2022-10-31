/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package ordenamiento;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Datos {

    public void datosAleatorios(int n) {

        try {
            String ruta = "datosPrueba.txt";
            File file = new File(ruta);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < n; i++) {
                int valorEntero = (int) Math.floor(Math.random() * (10000 - (-10000) + 1) + (-10000));
                bw.write(String.valueOf(valorEntero));
                bw.write("\n");
            }
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public int[] leerTxt(int arr[]) {
        try {
            File archivo = null;
            FileReader fr = null;
            BufferedReader br = null;
            archivo = new File("datosPrueba.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            int j = 0;
            while ((linea = br.readLine()) != null) {
                arr[j] = Integer.parseInt(linea);
                j++;
            }
            Arrays.sort(arr);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return arr;
    }

}
