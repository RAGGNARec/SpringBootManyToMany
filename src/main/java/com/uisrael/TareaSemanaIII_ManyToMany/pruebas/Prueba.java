package com.uisrael.TareaSemanaIII_ManyToMany.pruebas;

import com.uisrael.TareaSemanaIII_ManyToMany.entities.Estudiante;
import com.uisrael.TareaSemanaIII_ManyToMany.entities.Proyecto;
import com.uisrael.TareaSemanaIII_ManyToMany.repositories.EstudianteRepository;
import com.uisrael.TareaSemanaIII_ManyToMany.repositories.ProyectoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Transactional
public class Prueba implements CommandLineRunner {
    @Autowired
    private EstudianteRepository estudianteRepository;
    @Autowired
    private ProyectoRepository proyectoRepository;
    public void run(String... args)throws Exception{
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Javier Alejandro Herrera Salazar");

        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("Guillermo Damian Salazar Parra");

        Proyecto proyecto1 = new Proyecto();
        proyecto1.setNombre("Sistema de citas medicas");

        Proyecto proyecto2 = new Proyecto();
        proyecto2.setNombre("Sistema de gym 24/7");

        estudiante1.getProyectos().add(proyecto1);
        estudiante2.getProyectos().add(proyecto2);

        estudiante2.getProyectos().add(proyecto1);

        estudianteRepository.save(estudiante1);
        estudianteRepository.save(estudiante2);

        Estudiante estudianteRecuperado = estudianteRepository.findById(1L).orElse(null);
        System.out.println("Estudiante recuperado" + estudianteRecuperado.getNombre());

        Proyecto proyectoRecuperado = proyectoRepository.findById(1L).orElse(null);
        System.out.println("prouyecto recuperado" + proyectoRecuperado.getNombre());

        //estudianteRepository.deleteById(1L);
        //proyectoRepository.deleteById(1L);
    }
}
