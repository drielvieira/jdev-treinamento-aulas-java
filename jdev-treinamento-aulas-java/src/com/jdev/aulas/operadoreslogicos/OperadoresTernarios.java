package com.jdev.aulas.operadoreslogicos;

public class OperadoresTernarios {

	public static void main(String[] args) {
		/* Operadores ternarios s�o para micro valida��es 
		 * adequado para valida��es em uma linha s� (true / falses)*/
		
		int nota1 = 70;
		int nota2 = 70;
		int nota3 = 70;
		int nota4 = 70;
		
		int media = (nota1 + nota2 + nota3 + nota4) / 4;
		String saidaResultado;
		
		saidaResultado = media >= 70 ? "ALUNO APROVADO" : "ALUNO REPROVADO";
		
		System.out.println(saidaResultado);

	}

}
