package br.com.boaria.meu_primeiro_springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.boaria.meu_primeiro_springboot.model.Produto;
import br.com.boaria.meu_primeiro_springboot.repository.ProdutoRepository;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscarPorId(Long id) {
        return produtoRepository.findById(id);
    }

    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public void deletarProduto(Long id) {
        produtoRepository.deleteById(id);
    }
    
}
