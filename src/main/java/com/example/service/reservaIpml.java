package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.entity.reserva;
import com.example.respository.reservaRepository;

@Service

public class reservaIpml implements reservaService {
	

	@Autowired
	private reservaRepository reservarepository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<reserva> findAll() {
		return reservarepository.findAll();
		
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<reserva> findById(Integer id) {
		return reservarepository.findById(id);
	}

	@Override
	@Transactional
	public reserva save(reserva  reserva) {
		return reservarepository.save(reserva);
	}

	@Override
	public void deleteById(Integer id) {
		reservarepository.deleteById(id);

	}


}
