package br.com.boaria.meu_primeiro_springboot.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MensageRepository {

    public String obterMensagem() {
        return "Olá do Repositório!";
    }
    
}
