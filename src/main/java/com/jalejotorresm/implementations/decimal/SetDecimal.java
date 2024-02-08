package com.jalejotorresm.implementations.decimal;

public class SetDecimal {
	public static void setDecimal() {
		String binario = SetBinario.setBinario();
		String base = "";
		
		int decimal = 0;
		
		for (int i = 0; i < binario.length(); i++) {
			if (binario.charAt(i)=='0') {
				continue;
			}
			
			int numero = (int)Math.pow(2, i);
			
			decimal += numero;
		}
		
		for (int i = binario.length() - 1; i >= 0; i--) {
			base += binario.charAt(i);
		}
		
		System.out.printf("\nEl binario %s convertido a decimal es: %d\n", base, decimal);
	}
}
