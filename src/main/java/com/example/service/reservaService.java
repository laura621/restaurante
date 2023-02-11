package com.example.service;

import java.util.Optional;

import com.example.entity.reserva;
public interface reservaService {
	
	public Iterable <reserva> findAll();
	public Optional<reserva> findById(Integer id);
	public reserva save(reserva reserva);
	public void deleteById(Integer id);
	
	

}
