package io.github.unlp_oo.oo2_Ejercicio2_PiedraPapelTijera;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JuegoTest {

	
	Rol lagarto,piedra,papel,tijera,lagarto2,spock;
	
	@BeforeEach
	void setUp() throws Exception{
		lagarto = new Lagarto();
		piedra = new Piedra();
		papel = new Papel();
		tijera = new Tijera();
		spock = new Spock();
		lagarto2 = new Lagarto();
	}
	
	
	//Se debe hacer con todas las combinaciones. 
	
	@Test
	void test() {
		assertEquals("Gana Lagarto", lagarto.jugada(papel));
		assertEquals("Gana Piedra", lagarto.jugada(piedra));
		assertEquals("Gana Tijera", lagarto.jugada(tijera));
		assertEquals("Gana Lagarto", lagarto.jugada(spock));
		assertEquals("Empate", lagarto.jugada(lagarto2));
	}

}
