package oms.UD27.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import oms.UD27.dto.Producto;
import oms.UD27.services.ProductoServiceImpl;

@RestController
@RequestMapping("/productos")
public class ProductoController {
	@Autowired
	ProductoServiceImpl productoServiceImpl;
	
	@GetMapping("/all")
	public List<Producto> listarProductos(){
		return productoServiceImpl.listarProductos();
	}
	
	
	@PostMapping("/add")
	public Producto salvarProducto(@RequestBody Producto producto) {
		
		return productoServiceImpl.guardarProducto(producto);
	}
	
	
	@GetMapping("/{codigo}")
	public Producto ProductoXID(@PathVariable(name="codigo") int id) {
		
		Producto Producto_xid= new Producto();
		
		Producto_xid=productoServiceImpl.productoXID(id);
		
		System.out.println("Producto XID: "+Producto_xid);
		
		return Producto_xid;
	}
	
	@PutMapping("/{codigo}")
	public Producto actualizarProducto(@PathVariable(name="codigo")int id,@RequestBody Producto Producto) {
		
		Producto Producto_seleccionado= new Producto();
		Producto Producto_actualizado= new Producto();
		
		Producto_seleccionado= productoServiceImpl.productoXID(id);
		
		Producto_seleccionado.setNombre(Producto.getNombre());
		Producto_seleccionado.setPrecio(Producto.getPrecio());
		
		Producto_actualizado = productoServiceImpl.actualizarProducto(Producto_seleccionado);
		
		System.out.println("El Producto actualizado es: "+ Producto_actualizado);
		
		return Producto_actualizado;
	}
	
	@DeleteMapping("/{codigo}")
	public void eliminarProducto(@PathVariable(name="codigo")int id) {
		productoServiceImpl.eliminarProducto(id);
	}
}
