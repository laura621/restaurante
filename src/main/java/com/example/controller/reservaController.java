package com.example.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.reserva;
import com.example.service.reservaService;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins ="http://localhost:4200")

public class reservaController {
	
	
	
	@Autowired
	private reservaService reservaservice;
	
	
	@GetMapping
	public ResponseEntity<?> listar(){
		return ResponseEntity.ok(reservaservice.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> verId(@PathVariable Integer id){
		Optional<reserva>o=reservaservice.findById(id);
		if(o.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(o.get());
	}
	
	@PostMapping
	public ResponseEntity<?> guardarReserva(@RequestBody reserva reserva){
		reserva reservaBD=reservaservice.save(reserva);
		return ResponseEntity.status(HttpStatus.CREATED).body(reservaservice.save(reservaBD));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> editarReserva(@PathVariable Integer id, @RequestBody reserva reserva){
		Optional<reserva>o=reservaservice.findById(id);
		if(o.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		reserva reservaBD=o.get();
		reservaBD.setId(reserva.getId());


	
		
		
		
		return ResponseEntity.status(HttpStatus.CREATED).body(reservaservice.save(reservaBD));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminarReserva(@PathVariable Integer id){
		reservaservice.deleteById(id);
		return ResponseEntity.noContent().build();
	}


}
