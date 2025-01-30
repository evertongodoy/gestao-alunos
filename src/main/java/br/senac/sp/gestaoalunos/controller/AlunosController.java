package br.senac.sp.gestaoalunos.controller;


import br.senac.sp.gestaoalunos.model.AlunoModel;
import br.senac.sp.gestaoalunos.service.AlunoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping(value = "gestao-alunos")
public class AlunosController {

    private AlunoService alunoService;

    public AlunosController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping("/inicio")
    public String home() {
        return "index"; // O Spring procura o arquivo src/main/resources/templates/index.html
    }

    @GetMapping("/cadastro")
    public String mostrarFormularioCadastro(Model model) {
        model.addAttribute("aluno", new AlunoModel());
        return "cadastro-aluno";
    }

    @GetMapping("listar")
    public String listarAlunos(Model model) {
        List<AlunoModel> alunos = Arrays.asList(
                new AlunoModel("1", "João Silva", 202301L, LocalDate.of(2023, 2, 10), LocalDate.of(2005, 6, 15), "joao@email.com", "11999999999", "Nenhuma"),
                new AlunoModel("2", "Maria Oliveira", 202302L, LocalDate.of(2022, 8, 5), LocalDate.of(2004, 3, 20), "maria@email.com", "11988888888", "Aluno destaque")
        );
        model.addAttribute("alunos", alunos);
        return "listar-alunos";
    }

    @PostMapping("/salvar")
    public String salvarAluno(@ModelAttribute AlunoModel aluno) {
        System.out.println("Aluno salvo: " + aluno);
        return "redirect:/cadastro-aluno";
    }

}
