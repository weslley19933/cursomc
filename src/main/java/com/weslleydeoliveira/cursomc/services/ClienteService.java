package com.weslleydeoliveira.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weslleydeoliveira.cursomc.domain.Cliente;
import com.weslleydeoliveira.cursomc.repositories.ClienteRepository;
import com.weslleydeoliveira.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired //auto instancia o Objeto
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + "; Tipo: " + Cliente.class.getName()));
	}
	
	
	
	
}
