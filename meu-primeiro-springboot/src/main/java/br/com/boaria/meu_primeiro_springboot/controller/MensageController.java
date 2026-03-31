package br.com.boaria.meu_primeiro_springboot.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.boaria.meu_primeiro_springboot.service.MensageService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
public class MensageController {

    private final MensageService mensageService;

    public MensageController(MensageService mensageService) {
        this.mensageService = mensageService;
    }

    @GetMapping("/mensagem")
    public String mensagem() {
        return mensageService.obterMensagem();
    }
    
    
}
