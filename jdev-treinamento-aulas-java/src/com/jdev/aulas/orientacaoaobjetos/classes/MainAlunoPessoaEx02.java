package com.jdev.aulas.orientacaoaobjetos.classes;

import javax.swing.JOptionPane;

public class MainAlunoPessoaEx02 {

	public static void main(String[] args) {
		// USANDO O MÉTODO toString() EXEMPLO DA AULA
		/*ENTRADA -> PROCESSAMENTO -> SAIDA */
		
		
		//ENTRADA DE DADOS 
		String nome = JOptionPane.showInputDialog("QUAL É O NOME DO ALUNO? ");
		String idade = JOptionPane.showInputDialog("QUAL É A IDADE DO ALUNO? ");
		String dataNascimento = JOptionPane.showInputDialog("QUAL É A DATA DE NASCIMENTO ? ");
		
		String nota1 = JOptionPane.showInputDialog("PRIMEIRA NOTA: ");
		String nota2 = JOptionPane.showInputDialog("SEGUNDA NOTA: ");
		String nota3 = JOptionPane.showInputDialog("TERCEIRA NOTA: ");
		String nota4 = JOptionPane.showInputDialog("QUARTA NOTA: ");
		
		//INICIALIZAÇÃO DO OBJETO  (INSTANCIANDO)
		AlunoPessoaEx02 aluno = new AlunoPessoaEx02();
		
		//SETANDO O OBJETO 
		aluno.setNome(nome);
		aluno.setIdade(Integer.valueOf(idade));
		aluno.setDataNascimento(dataNascimento);
		
		aluno.setNota1(Double.parseDouble(nota1));
		aluno.setNota2(Double.parseDouble(nota2));
		aluno.setNota3(Double.parseDouble(nota3));
		aluno.setNota4(Double.parseDouble(nota4)); 
		
		System.out.println(aluno.toString()); /* DESCRIÇÃO DO OBJETO NA MEMORIA */
		System.out.println("MEDIA DO ALUNO: " + aluno.getMediaNota());
		System.out.println("RESULTADO:" + aluno.getAlunoAprovado());
		
		


	}

}
