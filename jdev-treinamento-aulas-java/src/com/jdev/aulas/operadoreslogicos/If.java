package com.jdev.aulas.operadoreslogicos;

public class If {

	public static void main(String[] args) {

		int mediaNota = 70;
		String nome = "riel";

		if (mediaNota >= 70 && nome.equals("adriel")) {
			System.out.println("ALUNO APROVADO");
		} else if (mediaNota < 70) {
			System.out.println("ALUNO REPROVADO");
		}else {
			System.out.println("ALUNO NÃO ENCONTRADO");
		}

	}

}
