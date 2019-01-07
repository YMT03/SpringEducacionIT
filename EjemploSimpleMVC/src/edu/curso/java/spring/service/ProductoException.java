package edu.curso.java.spring.service;

public class ProductoException extends Exception{
	
	public ProductoException(String msg){
		super(msg);
	}
	
	public ProductoException(String msg, Throwable errorOriginal){
		super(msg, errorOriginal);
	}

}
