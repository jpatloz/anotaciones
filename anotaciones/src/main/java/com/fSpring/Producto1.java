package com.fSpring;

public class Producto1{
	
	public Producto1(String nombre, int precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Producto1() {
		
	};
	
	private String nombre;
	private int precio;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}	

}