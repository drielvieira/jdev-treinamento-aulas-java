package com.jdev.aulas.orientacaoaobjetos.classes;

public class AlunoConstrutorEx {
		String nome;
		int idade;
		String dataNascimento;
		String registroGeral;
		String numeroCpf;
		String nomeMae;
		String nomePai;
		String dataMatricula;
		String nomeEscola;
		String serieMatriculado;

		/* UM CONSTRUTOR VAZIO É UMA BOA PRATICA DA LLINGUAGEM 
		 * APESAR DE QUE O JAVA CRIA ESSE CONSTRUTOR INTERNAMETE CASO O DEV NÃO FAZ 
		 * É PADRÃO */
		public AlunoConstrutorEx() {
			
		}
		
		/*PODEMOS CRIAR OUTROS CONSTRUTORES PARA USAR EX: */
		
		public AlunoConstrutorEx(String nomePadrao) {
			nome = nomePadrao;
		}
		
		public AlunoConstrutorEx(String nomePadrao, int idadePadrao) {
			nome = nomePadrao;
			idade = idadePadrao;
		}
}
