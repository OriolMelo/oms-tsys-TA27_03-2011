package oms.UD27.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import oms.UD27.dao.IMaquina_registradoraDAO;
import oms.UD27.dto.Maquina_registradora;

@Service
public class Maquina_registradoraServiceImpl implements IMaquina_registradoraService{
	@Autowired
	IMaquina_registradoraDAO iMaquina_registradoraDAO;

	@Override
	public List<Maquina_registradora> listarMaquinas_registradoras() {
		return iMaquina_registradoraDAO.findAll();
	}

	@Override
	public Maquina_registradora guardarMaquina_registradora(Maquina_registradora maquina) {
		return iMaquina_registradoraDAO.save(maquina);
	}

	@Override
	public Maquina_registradora maquinaXID(int id) {
		return iMaquina_registradoraDAO.findById(id).get();
	}

	@Override
	public Maquina_registradora actualizarMaquina_registradora(Maquina_registradora maquina) {
		return iMaquina_registradoraDAO.save(maquina);
	}

	@Override
	public void eliminarMaquina_registradora(int id) {
		iMaquina_registradoraDAO.deleteById(id);
	}
}
