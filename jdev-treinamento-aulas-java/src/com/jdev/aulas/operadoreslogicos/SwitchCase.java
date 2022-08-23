package com.jdev.aulas.operadoreslogicos;

public class SwitchCase {

	public static void main(String[] args) {
		/*SWITCH CASE: serve para operações exatas */
		
		int nota1 = 50;
		int nota2 = 50;
		int nota3 = 50;
		int nota4 = 50;
		
		int media = (nota1 + nota2 + nota3 + nota4)/ 4;
		
		switch (media) {
		case 70:
			System.out.println("ALUNO APROVADO");
			break;
			
		case 69:
			System.out.println("ALUNO EM RECUPERAÇÃO");
			break;

		default:
			System.out.println("ALUNO REPROVADO");
			break;
		}

	}

}
