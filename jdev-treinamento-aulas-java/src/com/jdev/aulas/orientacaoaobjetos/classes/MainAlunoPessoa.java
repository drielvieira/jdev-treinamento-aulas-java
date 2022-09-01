package com.jdev.aulas.orientacaoaobjetos.classes;

import javax.swing.JOptionPane;

public class MainAlunoPessoa {

	public static void main(String[] args) {
		/*ENTRADA -> PROCESSAMENTO -> SAIDA */
		
		/*ENTRADA DE DADOS */
		String nome = JOptionPane.showInputDialog("QUAL É O NOME DO ALUNO? ");
		String idade = JOptionPane.showInputDialog("QUAL É A IDADE DO ALUNO? ");
		String dataNascimento = JOptionPane.showInputDialog("QUAL É A DATA DE NASCIMENTO ? ");
		
		String nota1 = JOptionPane.showInputDialog("PRIMEIRA NOTA: ");
		String nota2 = JOptionPane.showInputDialog("SEGUNDA NOTA: ");
		String nota3 = JOptionPane.showInputDialog("TERCEIRA NOTA: ");
		String nota4 = JOptionPane.showInputDialog("QUARTA NOTA: ");
		
		/*INICIALIZAÇÃO DO OBJETO */
		AlunoPessoa alunoPessoa1 = new AlunoPessoa();
		
		/*SETANDO O OBJETO */
		alunoPessoa1.setNome(nome);
		alunoPessoa1.setIdade(Integer.valueOf(idade));
		alunoPessoa1.setDataNascimento(dataNascimento);
		
		alunoPessoa1.setNota1(Double.parseDouble(nota1));
		alunoPessoa1.setNota2(Double.parseDouble(nota2));
		alunoPessoa1.setNota3(Double.parseDouble(nota3));
		alunoPessoa1.setNota4(Double.parseDouble(nota4));
		
		/*CHAMANDO DOS DADOS E MOSTRANDO A SAIDA*/
		System.out.println("NOME DO ALUNO:" + alunoPessoa1.getNome());
		System.out.println("IDADE DO ALUNO: "+ alunoPessoa1.getIdade() + " ANOS");
		System.out.println("DATA DE NASCIMENTO: " + alunoPessoa1.getDataNascimento());
		System.out.println("MÉDIA: " + alunoPessoa1.getMediaNota());
		System.out.println("RESULTADO: " + (alunoPessoa1.getAlunoAprovado()? "APROVADO" : "REPROVADO"));

	}

}
