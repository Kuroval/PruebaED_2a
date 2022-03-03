package com.iescomercio.ed.bloque2.repaso.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un curso como una lista de instancias de la clase Persona llamada listaAlumnos
 * @author Carlos Saenz Adan
 * @version 1.0
 * @since 3.0
 * @see Persona
 */
public class Curso {
	/**
	 * Lista de objetos persona
	 */
	private List<Persona> listaAlumnos;

	/**
	 * Accion que elimina un alumno de listaAlumnos si el dni tiene 9 digitos alfanumericos y existe en la lista
	 * @param dni Cadena alfanumerica de 9 digitos dni del alumno a eliminar de la lista
	 * @throws Exception "El dni no tiene la longitud adecuada"
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if(dni.length()==9) {//comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); //solo hace falta el dni
		}else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}
	
	/**
	 * Accion que aniade un alumno a la lista de alumnos y por tanto al curso
	 * @param p Persona a aniadir al curso
	 */
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}
	
	/**
	 * Funcion que devuelve verdadero en caso de que el dni introducido por parametro se encuentre en el curso y
	 * falso en caso contrario
	 * @param dni Cadena alfanumerica de 9 digitos dni del alumno a aniadir a la lista
	 * @return Devuelve verdadero en caso de que el dni introducido por parametro se encuentre en el curso y
	 * falso en caso contrario
	 */
	public Boolean estaRegistrado(String dni) {
		int i =0;
		Boolean encontrado=false;
		while (!encontrado && i<listaAlumnos.size()) {
			if(listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado=true;
			}
			i++;
		}
		return encontrado;
	}
	
	/**
	 * Constructor que inicializa un curso como una lista vacia de alumnos
	 */
	public Curso() {
		listaAlumnos= new ArrayList<Persona>();
	}
	
	/**
	 * Funcion que duvuelve el numero de personas en un curso
	 * @return Devuelve un entero que es el numero de alumnos en el curso
	 */
	public Integer numeroAlumnos() {return listaAlumnos.size();}
	
	
	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
