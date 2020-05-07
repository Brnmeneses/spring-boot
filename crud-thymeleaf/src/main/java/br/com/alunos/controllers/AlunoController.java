package br.com.alunos.controllers;

import br.com.alunos.entities.Aluno;
import br.com.alunos.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class AlunoController {
    
    @Autowired
    private AlunoService repository;

    @GetMapping("/")
    public String index(@RequestParam(defaultValue = "0") int page,
                        Model model){
        model.addAttribute("data", repository.findAll(page));
        model.addAttribute("currentPage", page);
        return "index";
    }

    @PostMapping("/save")
    public String save(Aluno a){
        repository.save(a);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delete(Integer id){
        repository.delete(id);
        return "redirect:/";
    }

    @GetMapping("/findOne")
    @ResponseBody
    public Optional<Aluno> findOne(Integer id){
        return repository.findById(id);
    }
}
