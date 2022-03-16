package ec.edu.uce.dennis.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import ec.edu.uce.dennis.modelo.Director;
import ec.edu.uce.dennis.modelo.Pelicula;

@SpringBootTest
@Rollback(true)
@Transactional
class CatalagoServiceImplTest {

	@Autowired
	private IPeliculaService iPeliculaService;

	@Autowired
	private IDirectorService iDirectorService;

	@Autowired
	private ICatalagoService iCatalagoService;

	@Test
	void testPelicula() {

		assertEquals("Pablo", this.iCatalagoService.nombreDirectorPelicula("Guerra Z"));

	}

	@BeforeEach
	void datos() {

		Director director = new Director();
		director.setApellido("Escobar");
		director.setCedula("12345");
		director.setNombre("Pablo");

		List<Pelicula> list = new ArrayList<>();
		Pelicula p = new Pelicula();
		p.setDuracionEnMinutos(150);
		p.setTitulo("Guerra Z");
		p.setDirector(director);
		p.setSinopsis("guerra");
		list.add(p);

		director.setPeliculas(list);

		this.iDirectorService.insertar(director);
		this.iPeliculaService.guardarPeliculaNuevo(p);
	}
}
