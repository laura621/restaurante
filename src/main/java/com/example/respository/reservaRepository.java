package com.example.respository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.reserva;

@Repository
public interface reservaRepository  extends JpaRepository<reserva, Integer> {

}
