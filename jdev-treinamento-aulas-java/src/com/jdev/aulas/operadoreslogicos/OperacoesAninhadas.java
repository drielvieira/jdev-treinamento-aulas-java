package com.jdev.aulas.operadoreslogicos;

public class OperacoesAninhadas {

	public static void main(String[] args) {
		/*Operações aninhadas são operações dentro de operações */
		
		int nota1 = 70;
		int nota2 = 70;
		int nota3 = 70;
		int nota4 = 70;
		
		int media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media >= 50) {
			if (media >= 70) {
				System.out.println("ALUNO APROVADO DIRETO");
			} else {
				System.out.println("ALUNO EM RECUPERAÇÃO");
			}
		}else {
			System.out.println("REPROVADO DIRETO");
		}

	}

}
