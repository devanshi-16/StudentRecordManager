package com.example.studentrecordmanager.repository;

import com.example.studentrecordmanager.entity.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Entity,String> {

}
