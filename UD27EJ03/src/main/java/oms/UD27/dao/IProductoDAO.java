package oms.UD27.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import oms.UD27.dto.Producto;

public interface IProductoDAO extends JpaRepository<Producto, Integer>{
	
}
