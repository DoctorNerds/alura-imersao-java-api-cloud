package br.com.alura.linguagens.api;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class JogosController {
    
    @Autowired
    private JogosRepository repositorio;

    @GetMapping("/jogos")
    public List<Jogos> obterJogo() {
        List<Jogos> linguagens = repositorio.findAll();
        return linguagens;
    }

    @PostMapping("/jogos")
    public Jogos cadastrarJogo(@RequestBody Jogos linguagem) {
        Jogos linguagemSalva = repositorio.save(linguagem);
        return linguagemSalva;
    } 
    

    @DeleteMapping("/jogos/{orderId}")
    public ResponseEntity<Long> deleteJogo(@PathVariable(value = "id") Long orderId) {
        // Access the DB and delete the order
        return ResponseEntity.ok(orderId);
    }

}
