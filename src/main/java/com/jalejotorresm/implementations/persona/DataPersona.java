package com.jalejotorresm.implementations.persona;

import java.util.Scanner;

public class DataPersona {
    private String nombre;
    private String edad;

    public DataPersona(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    private void saludar() {
        System.out.printf("\nHola, eres %s y tienes %s años de edad.\n", this.nombre, this.edad);
    }

    public void setData() {
    	Scanner sc = new Scanner(System.in);
        String regex = "^[a-zA-ZÀ-ÿ\u00f1\u00d1]+$";
        System.out.println("Dime tu nombre:");
        this.nombre = sc.nextLine();

        while (!this.nombre.matches(regex)){
            System.out.println("\nInformacion incorrecta. Dime tu nombre por favor:");
            this.nombre = sc.nextLine();
        }

        regex = "^[0-9]+$";
        System.out.println("\nDime tu edad:");
        this.edad = sc.nextLine();

        while (!this.edad.matches(regex)){
            System.out.println("\nInformacion incorrecta. Dime tu edad por favor:");
            this.edad = sc.nextLine();
        }

    	sc.close();

        saludar();
    }
}
