package com.jdev.aulas.orientacaoaobjetos.classes;

import java.util.Objects;


/*ESSA CLASSE DISCIPLINA SERVIRÁ PARA TODOS OS OBJETOS E INSTANCIAS DE NOTAS E MATERIAS*/
public class DisciplinaAlunoUm {

	private double nota;
	private String disciplina;

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public int hashCode() {
		return Objects.hash(disciplina, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DisciplinaAlunoUm other = (DisciplinaAlunoUm) obj;
		return Objects.equals(disciplina, other.disciplina)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}

	@Override
	public String toString() {
		return "DisciplinaAlunoUm [nota=" + nota + ", disciplina=" + disciplina + "]";
	}

}
