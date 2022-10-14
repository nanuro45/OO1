package ar.edu.unlp.info.oo1.Banco;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentasTest {
	Cuenta cuenta;
	CajaAhorro cajaA;
	CuentaCorriente cuentaCorr;
	
	@BeforeEach
	void setUp() {
		cuentaCorr = new CuentaCorriente(12000,1000);
		cajaA = new CajaAhorro(1000);
	}
	@Test
	void testeoCajaAhorro() {
		double e = 1000;
		assertTrue(cajaA.extraer(1000));
		assertFalse(cajaA.extraer(1000000));
		assertTrue(cajaA.puedeExtraer(2000000));
		assertNull(cajaA.getSaldo());
		//assertEquals(cajaA.extraerSinControlar(100),e);
	}
	
	@Test
	void testeoCuentaCorriente() {
		
	}
	@Test
	void testeoCuenta() {
		
	}
}
