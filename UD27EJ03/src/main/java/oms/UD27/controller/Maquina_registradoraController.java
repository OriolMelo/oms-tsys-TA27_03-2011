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

import oms.UD27.dto.Maquina_registradora;
import oms.UD27.services.Maquina_registradoraServiceImpl;

@RestController
@RequestMapping("/maquinas")
public class Maquina_registradoraController {
	@Autowired
	Maquina_registradoraServiceImpl maquinaServiceImpl;
	
	@GetMapping("/all")
	public List<Maquina_registradora> listarMaquinas_registradoras(){
		return maquinaServiceImpl.listarMaquinas_registradoras();
	}
	
	
	@PostMapping("/add")
	public Maquina_registradora salvarMaquina_registradora(@RequestBody Maquina_registradora maquina) {
		
		return maquinaServiceImpl.guardarMaquina_registradora(maquina);
	}
	
	
	@GetMapping("/{codigo}")
	public Maquina_registradora Maquina_registradoraXID(@PathVariable(name="codigo") int id) {
		
		Maquina_registradora Maquina_registradora_xid= new Maquina_registradora();
		
		Maquina_registradora_xid=maquinaServiceImpl.maquinaXID(id);
		
		System.out.println("Maquina_registradora XID: "+Maquina_registradora_xid);
		
		return Maquina_registradora_xid;
	}
	
	@PutMapping("/{codigo}")
	public Maquina_registradora actualizarMaquina_registradora(@PathVariable(name="codigo")int id,@RequestBody Maquina_registradora Maquina_registradora) {
		
		Maquina_registradora Maquina_registradora_seleccionado= new Maquina_registradora();
		Maquina_registradora Maquina_registradora_actualizado= new Maquina_registradora();
		
		Maquina_registradora_seleccionado= maquinaServiceImpl.maquinaXID(id);
		
		Maquina_registradora_seleccionado.setPiso(Maquina_registradora.getPiso());
		
		Maquina_registradora_actualizado = maquinaServiceImpl.actualizarMaquina_registradora(Maquina_registradora_seleccionado);
		
		System.out.println("La maquina actualizada es: "+ Maquina_registradora_actualizado);
		
		return Maquina_registradora_actualizado;
	}
	
	@DeleteMapping("/{codigo}")
	public void eliminarMaquina_registradora(@PathVariable(name="codigo")int id) {
		maquinaServiceImpl.eliminarMaquina_registradora(id);
	}
}
