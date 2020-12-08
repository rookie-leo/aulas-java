package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.model.entities.Cliente;

@RestController
@RequestMapping("/cliente")
/*Todos os métodos da classe serão acessador por /cliente*/
public class ClienteController {

	@GetMapping(path = "/qualquer")
	public Cliente obterCliente(){
		return new Cliente(28, "Pedro", "123.456.789-00");
	}
	
	/*Passando parametros para Web Services*/
	@GetMapping("/{id}")//Na URL é esperado o valor do id do cliente
	public Cliente obterClientePorId1(@PathVariable int id) {//A marcaçõa indica que a variavel será utilizada no path 
		return new Cliente(id, "Maria", "987.654.321-00");
	}
	
	/*Passando parametros para Web Services*/
	@GetMapping
	public Cliente obterClientePorId2(
			@RequestParam(name="id", defaultValue="1") int id) {
		return new Cliente(id, "João Augusto", "111.222.333-444");
	}
}
