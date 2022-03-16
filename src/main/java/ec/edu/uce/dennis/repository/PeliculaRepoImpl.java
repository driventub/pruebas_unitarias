package ec.edu.uce.dennis.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.dennis.modelo.Pelicula;

@Repository
@Transactional
public class PeliculaRepoImpl implements IPeliculaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarPelicula(Pelicula pelicula) {
		this.entityManager.persist(pelicula);

	}

	@Override
	public void actualizarPelicula(Pelicula pelicula) {
		this.entityManager.merge(pelicula);
	}

	@Override
	public Pelicula buscarPelicula(Integer id) {
		return this.entityManager.find(Pelicula.class, id);
	}

	@Override
	public void borrarPelicula(Integer id) {
		Pelicula pelicula = this.buscarPelicula(id);
		this.entityManager.remove(pelicula);

	}

	@Override
	public Pelicula buscarPeliculaPorTitulo(String titulo) {
		TypedQuery<Pelicula> createQuery = this.entityManager
				.createQuery("select p from Pelicula p where p.titulo=:valor", Pelicula.class);
		createQuery.setParameter("valor", titulo);
		return createQuery.getSingleResult();
	}

}
