package oms.UD27.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import oms.UD27.dto.Venta;

public interface IVentaDAO extends JpaRepository<Venta, Integer>{
	
}
