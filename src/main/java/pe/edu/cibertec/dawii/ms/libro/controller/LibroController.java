package pe.edu.cibertec.dawii.ms.libro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.cibertec.dawii.ms.libro.model.Libro;
import pe.edu.cibertec.dawii.ms.libro.service.LibroService;									

@RestController					
@RequestMapping("/libros")					
public class LibroController {					

	@Autowired					
	private LibroService libroService;	

	@GetMapping("/")					
	public List<Libro> obtenerListaLibros(){					
	return libroService.obtenerLibros() ;					
	}					
	}					
	


