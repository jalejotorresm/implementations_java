package com.jalejotorresm.implementations.binario;

public class SetBinario {
	public static void setBinario() {
		int[] decimal = SetDecimal.setDecimal();
		
		int base = decimal[0];
		int numero = decimal[1];
		
		String binario = "";
		
		while (base > 0) {
			binario = Integer.toString(Math.floorMod(base, 2)) + binario;
			base = Math.floorDiv(base, 2);
		}
		
		System.out.printf("\nEl numero %d en binario es: %s\n", numero, binario);
	}
}
