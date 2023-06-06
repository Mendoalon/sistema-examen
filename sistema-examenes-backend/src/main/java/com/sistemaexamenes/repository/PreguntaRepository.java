package com.sistemaexamenes.repository;

import com.sistemaexamenes.entity.Examen;
import com.sistemaexamenes.entity.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface PreguntaRepository extends JpaRepository<Pregunta, Long> {
    Set<Pregunta> findByExamen(Examen examen);

}
