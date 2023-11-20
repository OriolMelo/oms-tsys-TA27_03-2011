package oms.UD27.services;

import java.util.List;

import oms.UD27.dto.Venta;

public interface IVentaService {
	//Metodos del CRUD
		public List<Venta> listarVentas(); //Listar All 
		
		public Venta guardarVenta(Venta venta);	//Guarda una venta CREATE
		
		public Venta ventaXID(int id); //Leer datos de una venta READ
		
		public Venta actualizarVenta(Venta venta); //Actualiza datos de la venta UPDATE
		
		public void eliminarVenta(int id);// Elimina la venta DELETE
}
