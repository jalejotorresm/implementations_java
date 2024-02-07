package com.jalejotorresm.selector;

import com.jalejotorresm.implementations.persona.Persona;

public class Selector {
	public static void selector() {
		String seleccion = Opciones.opcion();

		switch (seleccion) {
			case "fibonacci":
				System.out.println(seleccion);
				break;
			case "persona":
				Persona.persona();
				break;
			case "binario":
				System.out.println(seleccion);
				break;
			case "decimal":
				System.out.println(seleccion);
				break;
			case "factorial":
				System.out.println(seleccion);
				break;
		}
	}
}
