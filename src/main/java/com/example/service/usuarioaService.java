package com.example.service;

import java.util.Optional;

import com.example.entity.usuario;
public interface usuarioaService {

	public Iterable <usuario> findAll();
	public Optional<usuario> findById(Integer id);
	public usuario save(usuario admin);
	public void deleteById(Integer id);

}
