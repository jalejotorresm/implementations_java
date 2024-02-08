package com.jalejotorresm.implementations.fibonacci;

import java.util.ArrayList;
import java.util.Scanner;

public class Secuencia {
    public static ArrayList<Integer> secuencia() {
        Scanner sc = new Scanner(System.in);
        String regex = "^[0-9]+$";
        
        System.out.println("Cuantos numeros de la secuencia quieres ver:");
        String numero = sc.nextLine();
        
        while (!numero.matches(regex)) {
        	System.out.println("\nInformacion errada. Necesito un numero positivo para continuar:");
        	numero = sc.nextLine();
        }

        sc.close();
        
        int base = Integer.parseInt(numero);
        ArrayList<Integer> array = new ArrayList<Integer>();
        
        for (int i = 0; i < base; i++) {
        	array.add(1);
        }
        
        return array;
    }
    
}
