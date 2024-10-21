package com.uisrael.TareaSemanaIII_ManyToMany.repositories;

import com.uisrael.TareaSemanaIII_ManyToMany.entities.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

}
