package oms.UD27.services;

import java.util.List;

import oms.UD27.dto.Cajero;

public interface ICajeroService {
	//Metodos del CRUD
			public List<Cajero> listarCajeros(); //Listar All 
			
			public Cajero guardarCajero(Cajero cajero);	//Guarda un cajero CREATE
			
			public Cajero cajeroXID(int id); //Leer datos de un cajero READ
			
			public Cajero actualizarCajero(Cajero cajero); //Actualiza datos del cajero UPDATE
			
			public void eliminarCajero(int id);// Elimina el cajero DELETE
}
