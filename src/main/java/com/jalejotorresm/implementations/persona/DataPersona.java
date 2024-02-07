package com.jalejotorresm.implementations.persona;

import java.util.Scanner;

public class DataPersona {
    private String nombre;
    private int edad;

    public DataPersona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @SuppressWarnings("unused")
    private void saludar() {
        System.out.printf("\nHola, eres %s y tienes %d años de edad.\n", this.nombre, this.edad);
    }

    public void setData() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Dime tu edad: ");
    	
    	String input = sc.nextLine();
    	
    	System.out.println(input);
    	sc.close();
    }
}
