package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.iescomercio.ed.bloque2.repaso.modelo.Persona;

class PersonaTest {
	
	private Persona p;
	
	@BeforeEach
	void metodoBeforeEach() {
		p = new Persona("12345678A", "Perico", "Palotes");
	}

	@Test
	void testPersonaStringStringString() {
		assertEquals("12345678A", p.getDni());
		assertEquals("Perico", p.getNombre());
		assertEquals("Palotes", p.getApellido1());
	}

	@Test
	void testGetDni() {
		assertEquals("12345678A", p.getDni());
	}

//	EL METODO SetDni ESTA MAL, REVISAR (es porque mira lenght y no lenght-1)
	@Test
	void testSetDni() {
		Boolean haPasado = false;
		
		try {
			p.setDni("87654321B");
		} catch (Exception e1) {
			haPasado = true;
		}
		assertEquals("87654321B", p.getDni());
		assertFalse(haPasado);
		assertThrows(Exception.class, () -> p.setDni("987654321"));
		Exception e = assertThrows(Exception.class, () -> p.setDni("987654321"));
		assertEquals("El ultimo caracter introducido no es una letra", e.getMessage());
	}

	@Test
	void testGetNombre() {
		assertEquals("Perico", p.getNombre());
	}

	@Test
	void testSetNombre() {
		p.setNombre("Juanito");
		assertEquals("Juanito", p.getNombre());
	}

	@Test
	void testGetApellido1() {
		assertEquals("Palotes", p.getApellido1());
	}

	@Test
	void testSetApellido1() {
		p.setApellido1("Fulgencio");
		assertEquals("Fulgencio", p.getApellido1());
	}

}
