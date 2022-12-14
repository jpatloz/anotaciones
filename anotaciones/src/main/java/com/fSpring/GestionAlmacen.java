package com.fSpring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fSpring.Producto1;
import com.fSpring.Producto2;

@Service
public class GestionAlmacen {
	
	@Autowired
	RepoProducto1 repo1;
	@Autowired
	RepoProducto2 repo2;
	
	  public void insertarProducto1(Producto1 producto) {
		    repo1.insertar(producto);
		  }
		  
		  public void insertarProducto2(Producto2 producto) {
			repo2.insertar(producto);
		  }  
		  
		  public List<Producto1> listarTodosProductos1() {
		    return repo1.listarTodos();
		  }  
		  
		  public List<Producto2> listarTodosProductos2() {
		    return repo2.listarTodos();
		  }
		  

}
