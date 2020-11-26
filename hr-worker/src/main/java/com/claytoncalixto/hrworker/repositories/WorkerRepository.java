package com.claytoncalixto.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claytoncalixto.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
