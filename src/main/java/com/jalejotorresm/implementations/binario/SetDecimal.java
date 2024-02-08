package com.jalejotorresm.implementations.binario;

import java.util.Scanner;

public class SetDecimal {
	public static int[] setDecimal() {
		Scanner sc = new Scanner(System.in);
		String regex = "^[0-9]+$";
		
		System.out.println("Ingresa el numero a convertir:");
		String input = sc.nextLine();
		
		while(!input.matches(regex)) {
			System.out.println("\nInformacion incorrecta. Ingresa un numero positivo por favor:");
			input = sc.nextLine();
		}
		
		sc.close();
		
		int base = Integer.parseInt(input);
		int decimal = base;
		
		int[] array = {base, decimal};
		
		return array;
	}

}
