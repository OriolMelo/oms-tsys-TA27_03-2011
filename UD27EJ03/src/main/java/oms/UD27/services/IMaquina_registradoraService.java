package oms.UD27.services;

import java.util.List;

import oms.UD27.dto.Maquina_registradora;

public interface IMaquina_registradoraService {
	//Metodos del CRUD
		public List<Maquina_registradora> listarMaquinas_registradoras(); //Listar All 
		
		public Maquina_registradora guardarMaquina_registradora(Maquina_registradora maquina);	//Guarda una maquina CREATE
		
		public Maquina_registradora maquinaXID(int id); //Leer datos de una maquina READ
		
		public Maquina_registradora actualizarMaquina_registradora(Maquina_registradora maquina); //Actualiza datos de la maquina UPDATE
		
		public void eliminarMaquina_registradora(int id);// Elimina la maquina DELETE
}
