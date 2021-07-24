package com.accenture.bank.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.accenture.bank.entity.Agencia;
import com.accenture.bank.entity.Cliente;
import com.accenture.bank.repository.ClienteRepository;
import com.accenture.bank.repository.EnderecoRepository;

@Service
public class ClienteService {
	@Autowired
	ClienteRepository clienteaRepository;
//	@Autowired
//	EnderecoRepository enderecoRepository;
	
	public Cliente saveCliente(Cliente cliente) {
		//enderecoRepository.save(cliente.getEndereco());
		return clienteaRepository.save(cliente);
	}
}
