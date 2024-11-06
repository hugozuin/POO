package com.spring.teste.service;



import com.spring.teste.model.Produto;
import com.spring.teste.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private ProdutoRepository produtoRepository;

    public List<Produto> ListTodos(){
        return produtoRepository.findAll(); //select * from produto;
    }

    public Produto salvarProduto(Produto produto){
        produtoRepository.save(produto); //insert from produto
    }
}
