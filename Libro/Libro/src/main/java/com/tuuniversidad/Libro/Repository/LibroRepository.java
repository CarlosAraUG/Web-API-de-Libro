package com.tuuniversidad.Libro.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.tuuniversidad.Libro.Model.Libro;

public interface LibroRepository extends JpaRepository <Libro, Long> {
   
}
