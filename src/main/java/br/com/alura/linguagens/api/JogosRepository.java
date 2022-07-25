package br.com.alura.linguagens.api;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface JogosRepository extends MongoRepository<Jogos, String> {
    
}
