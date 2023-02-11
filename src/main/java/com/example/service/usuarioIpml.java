package com.example.service;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.entity.usuario;
import com.example.respository.usuarioRepository;



@Service
public class usuarioIpml implements usuarioaService {
	
	
	
	@Autowired
	private usuarioRepository usuariorepository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<usuario> findAll() {
		return usuariorepository.findAll();
		
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<usuario> findById(Integer id) {
		return usuariorepository.findById(id);
	}

	@Override
	@Transactional
	public usuario save(usuario  usuario) {
		return usuariorepository.save(usuario);
	}

	@Override
	public void deleteById(Integer id) {
		usuariorepository.deleteById(id);

	}

}
