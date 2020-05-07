package br.com.alunos;

import br.com.alunos.entities.Aluno;
import br.com.alunos.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlunosApplication implements CommandLineRunner {

	@Autowired
	private AlunoRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AlunosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		repository.save(new Aluno("João","da Silva"));
		repository.save(new Aluno("Maria","José dos Santos"));
		repository.save(new Aluno("Enzo","Mario Giona"));
		repository.save(new Aluno("Pedro","Paulo Diniz"));
		repository.save(new Aluno("Valentina","Farias de Melo"));
		repository.save(new Aluno("Joana","Letícia Amaral"));
		repository.save(new Aluno("Lúcia","Campos Salles de Toledo"));
		repository.save(new Aluno("Henrique","Guilherme dos Reis"));
		repository.save(new Aluno("Armando","Magnum Douglas Selva"));
		repository.save(new Aluno("Fiona","dos Equis Agnes"));
	}

}
