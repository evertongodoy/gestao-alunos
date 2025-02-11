package br.senac.sp.gestaoalunos.controller;

import br.senac.sp.gestaoalunos.model.AlunoModel;
import br.senac.sp.gestaoalunos.service.AlunoService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Objects;

@Controller
@RequestMapping(value = "gestao-alunos")
public class AlunosController {

    private static final String ALUNO = "aluno";
    private AlunoService alunoService;

    public AlunosController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping("/inicio")
    public String home() {
        return "index"; // O Spring procura o arquivo src/main/resources/templates/index.html
    }

    @GetMapping("/cadastro")
    public String mostrarFormularioCadastro(@RequestParam(required = false) String id, Model model) {
        if (id != null) {
            var aluno = alunoService.buscar(new AlunoModel().setId(id));
            if(Objects.nonNull(aluno)){
                model.addAttribute(ALUNO, aluno);
            } else {
                model.addAttribute(ALUNO, new AlunoModel());
            }
        } else {
            model.addAttribute(ALUNO, new AlunoModel());
        }
        return "cadastro-aluno"; // O Spring procura o arquivo src/main/resources/templates/cadastro-aluno.html
    }

    @GetMapping("listar")
    public String listarAlunos(Model model,
                               @RequestParam(defaultValue = "0") int page,
                               @RequestParam(defaultValue = "5") int size) {
        Pageable pageable = PageRequest.of(page, size);
        var alunos = alunoService.listar(pageable);
        model.addAttribute("alunos", alunos);
        return "listar-alunos"; // O Spring procura o arquivo src/main/resources/templates/listar-alunos.html
    }

    @PostMapping("/salvar")
    public String salvarAluno(@ModelAttribute AlunoModel aluno,
                              RedirectAttributes redirectAttributes) {
        if (!aluno.getId().isBlank() && aluno.getId() != null) {
            var alunoExistente = alunoService.buscar(aluno);
            alunoExistente.setNome(aluno.getNome());
            alunoExistente.setDataIngresso(aluno.getDataIngresso());
            alunoExistente.setDataNascimento(aluno.getDataNascimento());
            alunoExistente.setEmail(aluno.getEmail());
            alunoExistente.setTelefone(aluno.getTelefone());
            alunoService.salvar(alunoExistente);
        } else {
            aluno.setId(null);
            aluno = alunoService.salvar(aluno);
        }

        // Adicionando o nome do aluno ao RedirectAttributes
        redirectAttributes.addFlashAttribute("nomeAluno", aluno.getNome());

        return "redirect:/gestao-alunos/aluno-salvo"; // O Spring procura o arquivo src/main/resources/templates/aluno-salvo.html
    }

    
    @GetMapping("/aluno-salvo")
    public String alunoSalvo() {
        return "aluno-salvo"; // Renderiza a página aluno-salvo.html
    }

    @PostMapping("/deletar")
    public String deletarAluno(@ModelAttribute AlunoModel aluno,
                               RedirectAttributes redirectAttributes) {

        if (!aluno.getId().isBlank() && aluno.getId() != null) {
            var alunoModel = alunoService.buscar(new AlunoModel().setId(aluno.getId()));
            alunoService.deletar(alunoModel);
            redirectAttributes.addFlashAttribute("mensagem", "Aluno deletado com sucesso!");
        } else {
            redirectAttributes.addFlashAttribute("erro", "ID do aluno não encontrado para exclusão.");
        }
        return "redirect:/gestao-alunos/listar";
    }
    

}
