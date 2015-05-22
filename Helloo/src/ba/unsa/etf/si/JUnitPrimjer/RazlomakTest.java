package ba.unsa.etf.si.JUnitPrimjer;

import static org.junit.Assert.*;

import org.junit.Test;

public class RazlomakTest {

	@Test
	public void testRazlomak() {
		Razlomak r = new Razlomak();
		assertEquals("1/1", r.ispisi());
	}

	@Test
	public void testRazlomakInt() {
		Razlomak r = new Razlomak(5);
		assertEquals("5/1", r.ispisi());
	}

	@Test
	public void testRazlomakIntInt() {
		try{
			Razlomak r2 = new Razlomak(5,0);
			fail("Nije bacen izuzetak");
		} catch(Exception e){
			assertTrue(true);
		}
	}
	
	@Test
	public void testRazlomakPraviIntInt() {
		try{
			Razlomak r2 = new Razlomak(5,20);
			assertEquals("1/4", r2.ispisi());
		} catch(Exception e){
			assertTrue(false);
		}
	}

	@Test
	public void testSkrati() {
		try{
			Razlomak r = new Razlomak(5,20);
			r.skrati();
			assertEquals("1/4", r.ispisi());
		} catch(Exception e){
			assertTrue(false);
		}
	}

	@Test
	public void testZbir() {
		try{
			Razlomak r1 = new Razlomak(1,3);
			Razlomak r2 = new Razlomak(2,3);
			Razlomak r3 = r1.zbir(r2);
			assertEquals("1/1", r3.ispisi());
		} catch(Exception e){
			assertTrue(false);
		}
	}

	@Test
	public void testNegacija() {
		try{
			Razlomak r = new Razlomak(1,3);
			Razlomak r2 = r.negacija();
			assertEquals("-1/3", r2.ispisi());
		} catch(Exception e){
			assertTrue(false);
		}
	}

	@Test
	public void testRazlika() {
		try{
			Razlomak r1 = new Razlomak(1,3);
			Razlomak r2 = new Razlomak(2,3);
			Razlomak r3 = r2.razlika(r1);
			assertEquals("1/3", r3.ispisi());
		} catch(Exception e){
			assertTrue(false);
		}
	}

	@Test
	public void testProizvod() {
		try{
			Razlomak r1 = new Razlomak(1,3);
			Razlomak r2 = new Razlomak(2,3);
			Razlomak r3 = r1.proizvod(r2);
			assertEquals("2/9", r3.ispisi());
		} catch(Exception e){
			assertTrue(false);
		}
	}

	@Test
	public void testReciprocni() {
		try{
			Razlomak r2 = new Razlomak(2,3);
			Razlomak r = r2.reciprocni();
			assertEquals("3/2", r.ispisi());
		} catch(Exception e){
			assertTrue(false);
		}
	}

	@Test
	public void testKolicnik() {
		try{
			Razlomak r1 = new Razlomak(1,3);
			Razlomak r2 = new Razlomak(2,3);
			Razlomak r3 = r1.kolicnik(r2);
			assertEquals("1/2", r3.ispisi());
		} catch(Exception e){
			assertTrue(false);
		}
	}

	@Test
	public void testIspisi() {
		try{
			Razlomak r = new Razlomak(7,8);
			String s = "7/8";
			assertEquals(s, r.ispisi());
		} catch(Exception e){
			assertTrue(false);
		}
	}


}
