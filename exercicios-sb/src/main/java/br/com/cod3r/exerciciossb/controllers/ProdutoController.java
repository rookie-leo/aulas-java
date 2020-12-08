package br.com.cod3r.exerciciossb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.model.entities.Produto;
import br.com.cod3r.exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("api/produtos")
public class ProdutoController {

	/*Método responsável por criar um objeto*/
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@PostMapping
	public @ResponseBody Produto novoProduto(Produto produto) {
		/*Classe responsável por criar um novo produto, e salvar-lo no BD*/
		produtoRepository.save(produto);
		return produto;
	}
	
	@PostMapping("/total")
	public Produto novoProdutoDesconto(@RequestParam String nome, @RequestParam double preco, @RequestParam double desconto) {
		/*Classe responsável por criar um novo produto, e salvar-lo no BD*/
		Produto produto = new Produto(nome, preco, desconto); 
		produtoRepository.save(produto);
		return produto;
	}
}
