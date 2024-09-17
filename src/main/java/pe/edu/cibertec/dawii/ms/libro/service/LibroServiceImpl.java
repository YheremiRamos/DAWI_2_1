package pe.edu.cibertec.dawii.ms.libro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.dawii.ms.libro.model.Libro;
import pe.edu.cibertec.dawii.ms.libro.repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService {

	@Autowired 
	private LibroRepository libroRepository;

	@Override
	public List<Libro> obtenerLibros() {
		return libroRepository.findAll();
	}


	

}
