package com.tuuniversidad.Libro.Service;

import org.springframework.stereotype.Service;

import java.util.List;
import com.tuuniversidad.Libro.Model.Libro;
import com.tuuniversidad.Libro.Repository.LibroRepository;

@Service
public class LibroService {
    
    private LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public Libro guardarLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    public List<Libro> ObtenerLibros() {
        return libroRepository.findAll();
    }
}
