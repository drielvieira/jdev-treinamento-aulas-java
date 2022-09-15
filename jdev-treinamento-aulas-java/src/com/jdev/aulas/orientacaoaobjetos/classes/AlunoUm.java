package com.jdev.aulas.orientacaoaobjetos.classes;

import java.util.Objects;

public class AlunoUm {

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
	
	private DisciplinaAlunoUm disciplina = new DisciplinaAlunoUm();
	
	public void setDisciplina(DisciplinaAlunoUm disciplina) {
		this.disciplina = disciplina;
	}
	
	public DisciplinaAlunoUm getDisciplina() {
		return disciplina;
	}
	
	public AlunoUm() {}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
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
	
	
	public double getMediaNota() {
		return (disciplina.getNota1() + disciplina.getNota2()
		+ disciplina.getNota3()
		+ disciplina.getNota4()) / 4;
	}
	
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	@Override
	public String toString() {
		return "AlunoUm [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplina=" + disciplina + "]";
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(idade, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlunoUm other = (AlunoUm) obj;
		return idade == other.idade && Objects.equals(nome, other.nome);
	}
	
	
	
	
	
	
	
}
