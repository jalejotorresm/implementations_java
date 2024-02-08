package com.jalejotorresm.implementations.factorial;

import java.util.Scanner;

public class SetNumero {
	public static int setNumero() {
		Scanner sc = new Scanner(System.in);
		String regex = "^[0-9]+$";
		
		System.out.println("Dame un numero entero positivo para continuar:");
		String input = sc.nextLine();
		
		while (!input.matches(regex)) {
			System.out.println("\nRespuesta errada. Dame un numero entero positivo por favor:");
			input = sc.nextLine();
		}
		
		sc.close();
		
		int numero = Integer.parseInt(input);
		return numero;
	}
}
