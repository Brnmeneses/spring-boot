package br.com.alunos.services;

import br.com.alunos.entities.Aluno;
import br.com.alunos.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    public Page<Aluno> findAll(int page){
        Page<Aluno> alunos = repository.findAll(PageRequest.of(page, 4));
        return alunos;
    }

    public void save(Aluno a){
        repository.save(a);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }

    public Optional<Aluno> findById(Integer id){
        return repository.findById(id);
    }

}
