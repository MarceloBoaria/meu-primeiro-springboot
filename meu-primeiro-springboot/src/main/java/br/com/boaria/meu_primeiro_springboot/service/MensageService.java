package br.com.boaria.meu_primeiro_springboot.service;

import org.springframework.stereotype.Service;

import br.com.boaria.meu_primeiro_springboot.repository.MensageRepository;

@Service
public class MensageService {

    private final MensageRepository mensageRepository;

    public MensageService(MensageRepository mensageRepository) {
        this.mensageRepository = mensageRepository;
    }

    public String obterMensagem() {
        return mensageRepository.obterMensagem();
    }
    
}
