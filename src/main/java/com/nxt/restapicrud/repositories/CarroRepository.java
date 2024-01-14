package com.nxt.restapicrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nxt.restapicrud.entities.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
