package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CursoTest {

	private Curso c;
	
	@BeforeEach
	void metodoBeforeEachCurso() {
		c=new Curso();
		c.aniadirAlumno(new Persona("12345678A","Juan","Vivaldi"));
	}
	
	@Test
	void testEliminarAlumno() {
		Boolean haPasado = false;
		try {
			c.eliminarAlumno("12345678A");
		} catch (Exception e) {
			haPasado=true;
		}
		assertFalse(c.estaRegistrado("12345678A"));
		assertFalse(haPasado);
		assertThrows(Exception.class, () -> c.eliminarAlumno("12"));
		Exception e = assertThrows(Exception.class, () -> c.eliminarAlumno("12"));
		assertEquals("El dni no tiene la longitud adecuada", e.getMessage());
	}

	@Test
	void testAniadirAlumno() {
		c.aniadirAlumno(new Persona("87654321B","Susana","Horia"));
		assertTrue(c.estaRegistrado("87654321B"));
	}

	@Test
	void testEstaRegistrado() {
		fail("Not yet implemented");
	}

	@Test
	void testCurso() {
		fail("Not yet implemented");
	}

	@Test
	void testNumeroAlumnos() {
		fail("Not yet implemented");
	}

}
