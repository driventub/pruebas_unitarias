package ec.edu.uce.paulo.service;

import ec.edu.uce.paulo.modelo.HistoricoRetiro;

public interface IHistoricoRetiroService {
	void insertarHistoricoRetiro(HistoricoRetiro p);
	void borrarHistoricoRetiroPorId(Integer id);
	HistoricoRetiro buscarHistoricoRetiroPorId(Integer id);
	void updateHistoricoRetiro(HistoricoRetiro p);
	
}
