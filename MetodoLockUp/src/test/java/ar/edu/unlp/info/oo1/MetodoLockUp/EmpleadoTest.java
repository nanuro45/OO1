package ar.edu.unlp.info.oo1.MetodoLockUp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {
		Gerente gerente;
		
		@BeforeEach
		void setUp() {
			gerente = new Gerente("alan turing");
			
		}
		@Test
		void prueba() {
			assertEquals(gerente.aportes(),57000*0.05d);
		}
		@Test
		void pruebaSueldoB() {
			assertEquals(gerente.sueldoBasico(),67850);
		}
}
