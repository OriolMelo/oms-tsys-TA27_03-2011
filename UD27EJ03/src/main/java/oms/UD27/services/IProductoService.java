package oms.UD27.services;

import java.util.List;

import oms.UD27.dto.Producto;

public interface IProductoService {
	//Metodos del CRUD
	public List<Producto> listarProductos(); //Listar All 
	
	public Producto guardarProducto(Producto producto);	//Guarda un producto CREATE
	
	public Producto productoXID(int id); //Leer datos de un producto READ
	
	public Producto actualizarProducto(Producto producto); //Actualiza datos del producto UPDATE
	
	public void eliminarProducto(int id);// Elimina el producto DELETE
}
