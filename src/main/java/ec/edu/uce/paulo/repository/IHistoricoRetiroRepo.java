package ec.edu.uce.paulo.repository;

import ec.edu.uce.paulo.modelo.HistoricoRetiro;



public interface IHistoricoRetiroRepo {
	void insertarHistoricoRetiro(HistoricoRetiro p);
	void borrarHistoricoRetiroPorId(Integer id);
	HistoricoRetiro buscarHistoricoRetiroPorId(Integer id);
	void updateHistoricoRetiro(HistoricoRetiro p);
	
}
