package oms.UD27.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="maquinas_registradoras")
public class Maquina_registradora {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private int codigo;
	@Column(name = "piso")
	private int piso;
	@OneToMany
	@JoinColumn(name = "codigo")
	private List<Venta> venta;
	
	public Maquina_registradora() {
		
	}
	
	public Maquina_registradora(int codigo, int piso, List<Venta> venta) {
		super();
		this.codigo = codigo;
		this.piso = piso;
		this.venta = venta;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Venta")
	public List<Venta> getVenta() {
		return venta;
	}

	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}
	
}
