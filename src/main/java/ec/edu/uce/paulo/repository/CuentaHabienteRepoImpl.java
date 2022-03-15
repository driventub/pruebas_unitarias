package ec.edu.uce.paulo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.paulo.modelo.CuentaHabiente;






@Repository
@Transactional
public class CuentaHabienteRepoImpl implements ICuentaHabienteRepo {

	@PersistenceContext
	private EntityManager e;

	@Override
	public void insertarCuentaHabiente(CuentaHabiente p) {
		this.e.persist(p);

	}

	@Override
	public CuentaHabiente buscarCuentaHabientePorId(Integer id) {
		return this.e.find(CuentaHabiente.class, id);

	}

	@Override
	public void updateCuentaHabiente(CuentaHabiente p) {
		this.e.merge(p);

	}

	@Override
	public void borrarCuentaHabientePorId(Integer id) {
		CuentaHabiente gBorrar = this.buscarCuentaHabientePorId(id);
		this.e.remove(gBorrar);

	}

	
}
