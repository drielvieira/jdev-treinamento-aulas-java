package com.jdev.aulas.orientacaoaobjetos.classes;

public class AlunoConstrutorEx {
		/*ATRIBUTOS*/
		private String nome;
		private int idade;
		private	String dataNascimento;
		private	String registroGeral;
		private	String numeroCpf;
		private	String nomeMae;
		private	String nomePai;
		private	String dataMatricula;
		private	String nomeEscola;
		private	String serieMatriculado;

		/* UM CONSTRUTOR VAZIO É UMA BOA PRATICA DA LINGUAGEM 
		 * APESAR DE QUE O JAVA CRIA ESSE CONSTRUTOR INTERNAMETE CASO O DEV NÃO FAZ 
		 * É PADRÃO */
		public AlunoConstrutorEx() {
			
		}
		
		/*PODEMOS CRIAR OUTROS CONSTRUTORES PARA USAR EX: */
		
	/*	public AlunoConstrutorEx(String nomePadrao) {
			nome = nomePadrao;
		}
		
		public AlunoConstrutorEx(String nomePadrao, String dataNascimentoPadrao ,int idadePadrao) {
			nome = nomePadrao;
			idade = idadePadrao;
			dataNascimento = dataNascimentoPadrao;
		} */
		
		/*METODOS SETTERS E GETTERS DO OBJETO */
		
		/*MÉTODO SET QUE RECEBE DADOS*/
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getNome() {
			return nome;
		}
		
		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		public int getIdade() {
			return idade;
		}
		
		public void setDataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
		} 
		
		public String getDataNascimento() {
			return dataNascimento;
		}

		public String getRegistroGeral() {
			return registroGeral;
		}

		public void setRegistroGeral(String registroGeral) {
			this.registroGeral = registroGeral;
		}

		public String getNumeroCpf() {
			return numeroCpf;
		}

		public void setNumeroCpf(String numeroCpf) {
			this.numeroCpf = numeroCpf;
		}

		public String getNomeMae() {
			return nomeMae;
		}

		public void setNomeMae(String nomeMae) {
			this.nomeMae = nomeMae;
		}

		public String getNomePai() {
			return nomePai;
		}

		public void setNomePai(String nomePai) {
			this.nomePai = nomePai;
		}

		public String getDataMatricula() {
			return dataMatricula;
		}

		public void setDataMatricula(String dataMatricula) {
			this.dataMatricula = dataMatricula;
		}

		public String getNomeEscola() {
			return nomeEscola;
		}

		public void setNomeEscola(String nomeEscola) {
			this.nomeEscola = nomeEscola;
		}

		public String getSerieMatriculado() {
			return serieMatriculado;
		}

		public void setSerieMatriculado(String serieMatriculado) {
			this.serieMatriculado = serieMatriculado;
		}
		
		
}
