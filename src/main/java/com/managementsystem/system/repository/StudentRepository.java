package com.managementsystem.system.repository;

import com.managementsystem.system.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;



public interface StudentRepository extends JpaRepository<Student, Long>{

}