package com.jdev.aulas.tiposdedados;

public class DeclaracaoGlobalLocal {
	/* Declara��o de vari�vel Global compartilhado
	 * � acessivel a todos */
	static int maiorIdadeGlobal = 60;

	public static void main(String[] args) {
		/* Declara��o de vari�vel local
		 * � acessivel apenas nesse m�todo */
		int menorIdade = 12;
		System.out.println("Valor da variavel local: " + menorIdade + " [anos]");
		
		/* invocando o m�todo para printar na tela s*/
		metodoEx();
		

	}
	
	public static void metodoEx() {
	  System.out.println("Valor da variavel global: " + maiorIdadeGlobal+ " [anos]");
	}

}
