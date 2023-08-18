package com.rodrigo.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
