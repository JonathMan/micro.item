package com.micro.model;

public class Item {
	
	private Profes profesor;
	private Integer Numero;
	
	public Item(Profes profesor, Integer Numero) {
		super();
		this.profesor = profesor;
		this.Numero = Numero;
	}
	
	public Profes getProfesor() {
		return profesor;
	}
	public void setProfesor(Profes profesor) {
		this.profesor = profesor;
	}
	public Integer getNumero() {
		return Numero;
	}
	public void setNumero(Integer numero) {
		Numero = numero;
	}
	

}
