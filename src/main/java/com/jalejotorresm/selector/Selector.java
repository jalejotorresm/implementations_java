package com.jalejotorresm.selector;

import com.jalejotorresm.implementations.binario.Binario;
import com.jalejotorresm.implementations.factorial.Factorial;
import com.jalejotorresm.implementations.fibonacci.Fibonacci;
import com.jalejotorresm.implementations.persona.Persona;
import com.jalejotorresm.implementations.decimal.Decimal;

public class Selector {
	public static void selector() {
		String seleccion = Opciones.opcion();

		switch (seleccion) {
			case "fibonacci":
				Fibonacci.fibonacci();
				break;
			case "persona":
				Persona.persona();
				break;
			case "binario":
				Binario.binario();
				break;
			case "decimal":
				Decimal.decimal();
				break;
			case "factorial":
				Factorial.factorial();
				break;
		}
	}
}
