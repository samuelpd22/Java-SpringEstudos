package br.com.samuel.projeto.controller;

import br.com.samuel.projeto.dto.PerfilDTO;
import br.com.samuel.projeto.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/perfil")
@CrossOrigin
public class PerfilController {
    @Autowired
    private PerfilService perfilService;

    @GetMapping
    public List<PerfilDTO> listarTodos(){
        return perfilService.listarTodos();
    }

    @PostMapping
    public void inserir (@RequestBody PerfilDTO dto){
        perfilService.inserir(dto);
    }
    @PutMapping
    public PerfilDTO alterar (@RequestBody PerfilDTO dto){
        return perfilService.alterar(dto);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir (@PathVariable ("id") Long id){
        perfilService.excluir(id);
        return ResponseEntity.ok().build();
    }

}
