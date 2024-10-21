package com.uisrael.TareaSemanaIII_ManyToMany.repositories;

import com.uisrael.TareaSemanaIII_ManyToMany.entities.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Long> {

}
