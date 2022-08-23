package com.jdev.aulas.tiposdedados;

public class Operacoes {

	public static void main(String[] args) {
		// Fazendo operações
		
		int nota1 = 50;
		int nota2 = 70;
		int nota3 = 78;
		int nota4 = 60;
		
		double totalNota = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Total da média: " + totalNota + " [PONTOS]");
		
		//System.out.println( "Total: " + (nota1 + nota2 + nota3 + nota4) / 4);
		
		int uvas = 10;
		int mangas = 15;
		int laranjas = 8;
		int goiabas = 6;
		
		int frutas = (uvas + mangas + laranjas + goiabas);
		System.out.println("Soma do total de frutas: " + frutas + " [UN]");
		
		double alturaAntonio = 1.75;
		double alturaAna = 1.78;
		double alturaAngelo = 1.95;
		double alturaAntony = 1.65;
		
		double altura = (alturaAntonio + alturaAna + alturaAngelo + alturaAntony) / 4;
		System.out.println("Media da soma com 4: " + altura);
		
		

	}

}
