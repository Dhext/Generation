package com.MVCPractica10.Productos.model;

public class productos {
	private int idProducto;
	private double precioProducto;
	private String nombreProducto;
	
	public productos() {
		
	}
	
	public productos(int idProducto,double precioProducto,String nombreProducto) {
		this.nombreProducto=nombreProducto;
		this.idProducto=idProducto;
		this.precioProducto=precioProducto;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public double getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	
}
