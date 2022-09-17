package com.jdev.aulas.orientacaoaobjetos.classes;

import javax.swing.JOptionPane;

public class MainAlunoUm {

	public static void main(String[] args) {
		
		/*ENTRADA DE DADOS*/ 
		String nome = JOptionPane.showInputDialog("QUAL É O NOME DO ALUNO? ");
		String idade = JOptionPane.showInputDialog("QUAL É A IDADE DO ALUNO? ");
		String dataNascimento = JOptionPane.showInputDialog("QUAL É A DATA DE NASCIMENTO ? ");
			
		String disciplina1 = JOptionPane.showInputDialog("DISCIPLINA UM: ");
		String nota1 = JOptionPane.showInputDialog("PRIMEIRA NOTA: ");
		
		String disciplina2 = JOptionPane.showInputDialog("DISCIPLINA DOIS: ");
		String nota2 = JOptionPane.showInputDialog("SEGUNDA NOTA: ");
		
		String disciplina3 = JOptionPane.showInputDialog("DISCIPLINA TRÊS: ");
		String nota3 = JOptionPane.showInputDialog("TERCEIRA NOTA: ");
		
		String disciplina4 = JOptionPane.showInputDialog("DISCIPLINA QUATRO: ");
		String nota4 = JOptionPane.showInputDialog("QUARTA NOTA: ");
		
		/*INICIALIZAÇÃO DO OBJETO  (INSTANCIANDO)*/
		AlunoUm aluno = new AlunoUm();
		
		/*SETANDO O OBJETO*/ 
		aluno.setNome(nome);
		aluno.setIdade(Integer.valueOf(idade));
		aluno.setDataNascimento(dataNascimento);
			
				
		System.out.println(aluno.toString()); /*DESCRIÇÃO DO OBJETO NA MEMORIA*/
		System.out.println("MEDIA DO ALUNO: " + aluno.getMediaNota());
		System.out.println("RESULTADO:" + aluno.getAlunoAprovado());  
		
		
		/* SOBRE HASHCODE E EQUALS
		AlunoUm aluno2 = new AlunoUm();
		aluno2.setNome("ANA");
		aluno2.setIdade(25);
		
		AlunoUm aluno3 = new AlunoUm();
		aluno3.setNome("ANA");
		aluno3.setIdade(28);
		
		if(aluno2.equals(aluno3)) {
			System.out.println("NOME DOS ALUNOS SÃO IGUAIS");
		} else {
			System.out.println("NOME DOS ALUNOS NÃO IGUAIS");
		} */

	}

}
