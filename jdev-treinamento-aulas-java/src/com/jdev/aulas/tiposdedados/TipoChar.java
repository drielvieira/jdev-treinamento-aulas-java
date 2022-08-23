package com.jdev.aulas.tiposdedados;

public class TipoChar {

	public static void main(String[] args) {
		/* O tipo CHAR representa uma letra
		 * um caracter */
		
		char letra = 'A';
		char sexo = 'M';
		char valorLogico = 'V';
		System.out.println("Letra: " + letra);
		System.out.println("Sexo: " + sexo);
		System.out.println("Valor Logico: " + valorLogico);
		
		if (sexo == 'F') {
			System.out.println("Pessoa do sexo Femenino");
		} else {
			System.out.println("Pessoa do sexo Masculino");
		}

	}

}
