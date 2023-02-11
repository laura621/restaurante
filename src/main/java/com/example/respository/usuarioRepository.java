package com.example.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.usuario;

@Repository
public interface usuarioRepository  extends JpaRepository<usuario, Integer> {

}
