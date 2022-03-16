package ec.edu.uce.dennis.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.dennis.modelo.Director;

@Transactional
@Repository
public class DirectorRepoImpl implements IDirectorRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Director director) {
		this.entityManager.persist(director);
	}

	@Override
	public void actualizar(Director director) {
		this.entityManager.merge(director);
	}

	@Override
	public Director buscar(Integer id) {
		return this.entityManager.find(Director.class, id);
	}

	@Override
	public void borrar(Integer id) {
		this.entityManager.remove(this.buscar(id));
	}

	@Override
	public Director buscarCedula(String cedula) {
		TypedQuery<Director> myQuery = this.entityManager.createQuery("SELECT c FROM Director c WHERE c.cedula=:valor",
				Director.class);
		myQuery.setParameter("valor", cedula);
		return myQuery.getSingleResult();
	}

}
