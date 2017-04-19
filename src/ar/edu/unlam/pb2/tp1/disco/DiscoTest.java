package ar.edu.unlam.pb2.tp1.disco;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class DiscoTest {

	@Test
	public void testGetRadioInterior() {
		Disco disco = new Disco(5D, 15D);
		
		Assert.assertEquals(disco.getRadioInterior(), 5D);
	}
	
	@Test
	public void testGetRadioExterior() {
		Disco disco = new Disco(5D, 15D);
		
		Assert.assertEquals(disco.getRadioExterior(), 15D);
	}
	
	@Test
	public void testSetRadioInterior() {
		Disco disco = new Disco(5D, 15D);
		disco.setRadioInterior(30D);
		
		Assert.assertEquals(disco.getRadioInterior(), 30D);
	}
	
	@Test
	public void testSetRadioExterior() {
		Disco disco = new Disco(5D, 15D);
		disco.setRadioExterior(30D);
		
		Assert.assertEquals(disco.getRadioExterior(), 30D);
	}
	
	@Test
	public void testObtenerPerimetroInterior() {
		Disco disco = new Disco(5D, 15D);
		Double perimetroInteriorEsperado = 2 * Math.PI * 5D;
		
		Assert.assertEquals(disco.obtenerPerimetroInterior(), perimetroInteriorEsperado);
		
		disco.setRadioExterior(70D);
		Assert.assertEquals(disco.obtenerPerimetroInterior(), perimetroInteriorEsperado);
	}
	
	@Test
	public void testObtenerPerimetroExterior() {
		Disco disco = new Disco(5D, 15D);
		Double perimetroExteriorEsperado = 2 * Math.PI * 15D;
		
		Assert.assertEquals(disco.obtenerPerimetroExterior(), perimetroExteriorEsperado);
		
		disco.setRadioInterior(70D);
		Assert.assertEquals(disco.obtenerPerimetroExterior(), perimetroExteriorEsperado);
	}
	
	@Test
	public void testObtenerSuperficie() {
		Disco disco = new Disco(5D, 15D);
		
		Double superficieEsperada = (Math.PI * Math.pow(15D, 2)) - (Math.PI * Math.pow(5D, 2)); 
		
		Assert.assertEquals(disco.obtenerSuperficie(), superficieEsperada);
		
		disco.setRadioInterior(10D);
		superficieEsperada = (Math.PI * Math.pow(15D, 2)) - (Math.PI * Math.pow(10D, 2));
		Assert.assertEquals(disco.obtenerSuperficie(), superficieEsperada);
		
	}

}
