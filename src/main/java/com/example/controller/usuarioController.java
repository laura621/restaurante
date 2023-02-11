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

import com.example.entity.usuario;
import com.example.service.usuarioaService;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins ="http://localhost:4200")

public class usuarioController {
	
	
	@Autowired
	private usuarioaService usuarioservice;
	
	
	@GetMapping
	public ResponseEntity<?> listar(){
		return ResponseEntity.ok(usuarioservice.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> verId(@PathVariable Integer id){
		Optional<usuario>o=usuarioservice.findById(id);
		if(o.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(o.get());
	}
	
	@PostMapping
	public ResponseEntity<?> guardarUsuario(@RequestBody usuario usuario){
		usuario usuarioBD=usuarioservice.save(usuario);
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioservice.save(usuarioBD));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> editarUsuario(@PathVariable Integer id, @RequestBody usuario usuario){
		Optional<usuario>o=usuarioservice.findById(id);
		if(o.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		usuario usuarioBD=o.get();
		usuarioBD.setNumidentificacion(usuario.getNumidentificacion());
		usuarioBD.setRol(usuario.getRol());


	
		
		
		
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioservice.save(usuarioBD));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminarCity(@PathVariable Integer id){
		usuarioservice.deleteById(id);
		return ResponseEntity.noContent().build();
	}

	
	

}
