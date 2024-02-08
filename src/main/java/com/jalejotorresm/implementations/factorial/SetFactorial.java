package com.jalejotorresm.implementations.factorial;

import java.math.BigInteger;

public class SetFactorial {
	public static void setFactorial() {
		int base = SetNumero.setNumero();
		BigInteger numero = BigInteger.valueOf(base);
		BigInteger resultado = BigInteger.ONE;
		
		for (BigInteger i = BigInteger.TWO; i.compareTo(numero) <= 0; i = i.add(BigInteger.ONE)) {
			resultado = resultado.multiply(i);
		}
		
		System.out.printf("\nEl factorial de %d es: %s\n", base, resultado);
	}
}
