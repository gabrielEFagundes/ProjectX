package com.gundes.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gundes.app.domain.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
    
}
