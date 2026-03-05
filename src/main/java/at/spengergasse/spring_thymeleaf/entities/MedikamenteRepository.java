package at.spengergasse.spring_thymeleaf.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface MedikamenteRepository extends JpaRepository<Medikamente,Integer>
{}
