package pe.edu.cibertec.dawii.ms.libro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.cibertec.dawii.ms.libro.model.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer>  {

}
