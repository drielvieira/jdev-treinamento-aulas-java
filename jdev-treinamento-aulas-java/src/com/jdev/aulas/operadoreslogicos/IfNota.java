package com.jdev.aulas.operadoreslogicos;

public class IfNota {

	public static void main(String[] args) {

		int nota1 = 90;
		int nota2 = 80;
		int nota3 = 90;
		int nota4 = 70;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 70) {
			System.out.println("ALUNO APROVADO COM MEDIA " + media);
		}
		/*if (media >= 50 && media <= 69) {
			System.out.println("ALUNO EM RECUPERAÇÃO COM MEDIA " + media);
		}*/ else {
			System.out.println("ALUNO REPROVADO COM MEDIA " + media);
		}

	}

}
