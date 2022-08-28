package com.jdev.aulas.orientacaoaobjetos.classes;


public class MainAlunoConstrutorEx {

	public static void main(String[] args) {
		/* CRIANDO UM CONSTRUTOR PARA O OBJETO
		 * OU SEJA CRIANDO UM OBJETO EM MEMORIA */
		
		/* AGORA TEMOS UM OBJETO REAL NA MEMORIA */
							/*REFERENCIA*/		/*INSTANCIA*/
		AlunoConstrutorEx 	aluno1 =		 new AlunoConstrutorEx();
		
		aluno1.setNome("ANTONIO PERERIA JUBARTI");
		aluno1.setIdade(78);
		aluno1.setDataNascimento("14/05/1888");
		aluno1.setNomeMae("JOANA APARECIDA");
		
		System.out.println("NOME: " + aluno1.getNome());
		System.out.println("IDADE:" + aluno1.getIdade() + " ANOS");
		System.out.println("DATA DE NASCIMENTO: " + aluno1.getDataNascimento());
		System.out.println("NOME DA MÃE: " + aluno1.getNomeMae());
		
		System.out.println("===================================================");
		
		AlunoConstrutorEx   aluno2 = 		new AlunoConstrutorEx();
		
		aluno2.setNome("JOSE MATIAS ANGELO");
		aluno2.setIdade(55);
		aluno2.setDataNascimento("18/09/2055");
		aluno2.setNomeMae("ANTONIA SILVEIRA");
		
		System.out.println("NOME: " + aluno2.getNome());
		System.out.println("IDADE:" + aluno2.getIdade() + " ANOS");
		System.out.println("DATA DE NASCIMENTO: " + aluno2.getDataNascimento());
		System.out.println("NOME DA MÃE: " + aluno2.getNomeMae());
		
		System.out.println("===================================================");
		
		
		AlunoConstrutorEx   aluno3 = 		new AlunoConstrutorEx();
		
		aluno3.setNome("ANTONIA PERERIA ");
		aluno3.setIdade(66);
		aluno3.setDataNascimento("14/05/1858");
		aluno3.setNomeMae("JOAQUINA ATONIETA SAMPAIO");
		
		System.out.println("NOME: " + aluno3.getNome());
		System.out.println("IDADE:" + aluno3.getIdade() + " ANOS");
		System.out.println("DATA DE NASCIMENTO: " + aluno3.getDataNascimento());
		System.out.println("NOME DA MÃE: " + aluno3.getNomeMae());
		
		
		
		
		

	}

}
