package com.jalejotorresm.implementations.decimal;

import java.util.Scanner;

public class SetBinario {
	public static String setBinario() {
		Scanner sc = new Scanner(System.in);
		String regex = "^[01]+$";
		String binario = "";
		
		System.out.println("Dame el numero binario a convertir:");
		String input = sc.nextLine();
		
		while(!input.matches(regex)) {
			System.out.println("\nInformacion errada. Dame un numero binario valido por favor:");
			input = sc.nextLine();
		}
		
		sc.close();
		
		for (int i = input.length() - 1; i >= 0; i--) {
			binario += input.charAt(i);
		}
		
		return binario;
	}
}
