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
@Table(name="cajeros")
public class Cajero {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private int codigo;
	@Column(name = "nom_Apels")
	private String nombre_completo;
	@OneToMany
	@JoinColumn(name = "codigo")
	private List<Venta> venta;
	
	public Cajero() {
		
	}
	
	public Cajero(int codigo, String nombre_completo, List<Venta> venta) {
		super();
		this.codigo = codigo;
		this.nombre_completo = nombre_completo;
		this.venta = venta;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre_completo() {
		return nombre_completo;
	}

	public void setNombre_completo(String nombre_completo) {
		this.nombre_completo = nombre_completo;
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
