package com.weslleydeoliveira.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weslleydeoliveira.cursomc.domain.Pedido;
import com.weslleydeoliveira.cursomc.repositories.PedidoRepository;
import com.weslleydeoliveira.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired //auto instancia o Objeto
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + "; Tipo: " + Pedido.class.getName()));
	}
	
	
	
	
}
