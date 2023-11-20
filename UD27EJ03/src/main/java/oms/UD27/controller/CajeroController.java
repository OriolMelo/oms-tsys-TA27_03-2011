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

import oms.UD27.dto.Cajero;
import oms.UD27.services.CajeroServiceImpl;

@RestController
@RequestMapping("/cajeros")
public class CajeroController {
	@Autowired
	CajeroServiceImpl cajeroServiceImpl;
	
	@GetMapping("/all")
	public List<Cajero> listarCajero(){
		return cajeroServiceImpl.listarCajeros();
	}
	
	
	@PostMapping("/add")
	public Cajero salvarCajero(@RequestBody Cajero cajero) {
		
		return cajeroServiceImpl.guardarCajero(cajero);
	}
	
	
	@GetMapping("/{codigo}")
	public Cajero CajeroXID(@PathVariable(name="codigo") int id) {
		
		Cajero Cajero_xid= new Cajero();
		
		Cajero_xid=cajeroServiceImpl.cajeroXID(id);
		
		System.out.println("Cajero XID: "+Cajero_xid);
		
		return Cajero_xid;
	}
	
	@PutMapping("/{codigo}")
	public Cajero actualizarCajero(@PathVariable(name="codigo")int id,@RequestBody Cajero Cajero) {
		
		Cajero Cajero_seleccionado= new Cajero();
		Cajero Cajero_actualizado= new Cajero();
		
		Cajero_seleccionado= cajeroServiceImpl.cajeroXID(id);
		
		Cajero_seleccionado.setNombre_completo(Cajero.getNombre_completo());
		
		Cajero_actualizado = cajeroServiceImpl.actualizarCajero(Cajero_seleccionado);
		
		System.out.println("El Cajero actualizado es: "+ Cajero_actualizado);
		
		return Cajero_actualizado;
	}
	
	@DeleteMapping("/{codigo}")
	public void eliminarCajero(@PathVariable(name="codigo")int id) {
		cajeroServiceImpl.eliminarCajero(id);
	}
}
