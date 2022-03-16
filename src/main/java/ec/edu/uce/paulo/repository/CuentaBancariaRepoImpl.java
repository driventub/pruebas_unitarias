package ec.edu.uce.paulo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.paulo.modelo.CuentaBancaria;




@Repository
@Transactional
public class CuentaBancariaRepoImpl implements ICuentaBancariaRepo {

	private static final Logger LOG = LoggerFactory.getLogger(CuentaBancariaRepoImpl.class); 
	
	@PersistenceContext
	private EntityManager e;

	@Override
	public void insertarCuentaBancaria(CuentaBancaria p) {
		this.e.persist(p);

	}

	@Override
	public CuentaBancaria buscarCuentaBancariaPorId(Integer id) {
		return this.e.find(CuentaBancaria.class, id);

	}

	@Override
//	@Transactional(value = TxType.REQUIRES_NEW)
	public void updateCuentaBancaria(CuentaBancaria p) {
		this.e.merge(p);
		try {
			throw new NullPointerException();	
		}catch(NullPointerException e) {
			LOG.info("Se absorbio la excepcion");
		}
		

	}

	@Override
	public void borrarCuentaBancariaPorId(Integer id) {
		CuentaBancaria gBorrar = this.buscarCuentaBancariaPorId(id);
		this.e.remove(gBorrar);

	}

	@Override
	public List<CuentaBancaria> buscarPorCedula(String cedula) {
//		creo que se tiene que cambiar algo aqui
//		AND f.cuentaHabiente = d.id
		TypedQuery<CuentaBancaria> myTypedQuery = (TypedQuery<CuentaBancaria>) this.e
				.createQuery("SELECT f FROM CuentaBancaria f JOIN f.cuentaHabiente d WHERE d.cedula =:valor ",CuentaBancaria.class);
		myTypedQuery.setParameter("valor", cedula);
		
		List<CuentaBancaria> l1 = myTypedQuery.getResultList();
		
		LOG.info("Longitud " + l1.size());
		for(CuentaBancaria f : l1) {
			LOG.info(f.toString());
		}
			
			
		return l1;

	}

	@Override
	public CuentaBancaria buscarPorNumCuenta(String numCuenta) {
		TypedQuery<CuentaBancaria> myTypedQuery = (TypedQuery<CuentaBancaria>) this.e
				.createQuery("SELECT f FROM CuentaBancaria f WHERE f.numCuenta =:valor ",CuentaBancaria.class);
		myTypedQuery.setParameter("valor", numCuenta);
		return myTypedQuery.getSingleResult();
	}

}
