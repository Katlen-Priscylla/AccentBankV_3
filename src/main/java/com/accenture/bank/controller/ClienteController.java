package com.accenture.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.bank.entity.Cliente;
import com.accenture.bank.servico.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	@Autowired
	ClienteService clienteService;
	
	@PostMapping
	public Cliente save(@RequestBody Cliente cliente) {
		return clienteService.saveCliente(cliente);
	}
}
