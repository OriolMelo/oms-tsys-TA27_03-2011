package oms.UD27.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="venta")
public class Venta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //id extra para tabla intermedia
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "cajero")
    Cajero cajero;
 
    @ManyToOne
    @JoinColumn(name = "producto")
    Producto producto;

    @ManyToOne
    @JoinColumn(name = "maquina")
    Maquina_registradora maquina;

    public Venta() {
    	
    }

	public Venta(int id, Cajero cajero, Producto producto, Maquina_registradora maquina) {
		super();
		this.id = id;
		this.cajero = cajero;
		this.producto = producto;
		this.maquina = maquina;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cajero getCajero() {
		return cajero;
	}

	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Maquina_registradora getMaquina() {
		return maquina;
	}

	public void setMaquina(Maquina_registradora maquina) {
		this.maquina = maquina;
	}
    
}
