package com.jdev.aulas.tiposdedados;

public class DeclaracaoGlobalLocal {
	/* Declaração de variável Global compartilhado
	 * é acessivel a todos */
	static int maiorIdadeGlobal = 60;

	public static void main(String[] args) {
		/* Declaração de variável local
		 * é acessivel apenas nesse método */
		int menorIdade = 12;
		System.out.println("Valor da variavel local: " + menorIdade + " [anos]");
		
		/* invocando o método para printar na tela s*/
		metodoEx();
		

	}
	
	public static void metodoEx() {
	  System.out.println("Valor da variavel global: " + maiorIdadeGlobal+ " [anos]");
	}

}
