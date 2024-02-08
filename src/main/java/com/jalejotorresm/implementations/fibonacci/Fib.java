package com.jalejotorresm.implementations.fibonacci;

import java.util.ArrayList;

public class Fib {
    public static void fib() {
    	ArrayList<Integer> secuencia = Secuencia.secuencia();
    	
    	for (int i = 2; i < secuencia.size(); i++) {
    		int numero = secuencia.get(i-2) + secuencia.get(i-1);
    		secuencia.set(i, numero);
    	}
    	
    	System.out.printf("\nLos primeros %d numeros de la secuencia Fibonacci son:\n", secuencia.size());
    	
    	for (int i = 0; i < secuencia.size(); i++) {
    		if (i < secuencia.size() - 2) {
    			System.out.printf("%d, ", secuencia.get(i));
    		} else if (i == secuencia.size() - 2) {
    			System.out.printf("%d y ", secuencia.get(i));
    		} else {
    			System.out.printf("%d.\n", secuencia.get(i));
    		}
    	}
    }
}
