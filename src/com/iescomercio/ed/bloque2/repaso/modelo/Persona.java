package com.iescomercio.ed.bloque2.repaso.modelo;

/**
 * Clase que representa una persona como una cadena dni que es el dni de la persona, una cadena nombre que es el nombre/nombres 
 * de la persona y apellido1 que es el primer apellido de la persona
 * @author Carlos Saenz Adan
 * @version 1.0
 * @since 3.0
 * @see Curso
 */

public class Persona{
	/**
	 * Cadena que representa el dni de una persona
	 */
	private String dni;
	/**
	 * Cadena que representa el nombre/nombres de una persona
	 */
	private String nombre;
	/**
	 * Cadena que representa el primer apellido de una persona
	 */
	private String apellido1;
	
	public Persona() {}
	
	/**
	 * Constructor que crea un objeto del tipo persona con los parametros introducidos como parametro
	 * @param dni dni de la persona a crear
	 * @param nombre nombre/nombres de la persona a crear
	 * @param apellido1 primer apellido de la persona a crear
	 */
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}
	
	/**
	 * Funcion que devuelve el dni de la persona
	 * @return Devuelve una cadena dni que es el dni de la persona
	 */
	public String getDni() {
		return dni;
	}
	
	//Lo comento como si estuviese bien
	/**
	 * Accion que cambia el valor del dni de una persona si el dni acaba en letra
	 * @param dni cadena dni que sustituira al antiguo dni
	 * @throws Exception "El ultimo caracter introducido no es una letra"
	 */
	public void setDni(String dni) throws Exception {
		//comprobacion de si el ultimo caracter es una letra
		if(Character.isLetter(dni.charAt(dni.length()))) {
			this.dni=dni;
		}else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}
	
	/**
	 * Funcion que devuelve el nombre de la persona
	 * @return Devuelve una cadena nombre que es el nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Accion que cambia el valor del nombre de una persona 
	 * @param nombre cadena por la que se cambiara el antiguo nombre de la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Funcion que devuelve el primer apellido de la persona
	 * @return Devuelve una cadena apellido1 que es el primer apellido de la persona
	 */
	public String getApellido1() {
		return apellido1;
	}
	
	/**
	 * Accion que cambia el valor del primer apellido de una persona
	 * @param apellido1 cadena por la que se cambiara el antiguo primer apellido de la persona
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	

}
