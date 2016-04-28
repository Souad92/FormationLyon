package sk.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import sk.metier.Pile;
import sk.metier.PilePleineException;

public class TestPile {

	Pile p;

	@Before
	public void before() {
		p = new Pile();
	}

	@Test
	public void estVide() {
		// fail("Not yet implemented");
		boolean b = p.estVide();
		assertEquals(true, b);
	}

	@Test
	public void estPleine() {
		boolean b = p.estPleine();
		assertEquals(false, b);
		p.setSp(9);
		assertFalse(p.estPleine());
	}

	@Test
	public void empiler_vide() {
		try {
			p.empiler(2);
		} catch (PilePleineException e) {
			e.printStackTrace();
		}
		boolean b = p.estVide();
		assertEquals(false, b);
	}

	@Test
	public void empiler_pleine() {
		try {
			p.empiler(3);
		} catch (PilePleineException e) {
			e.printStackTrace();
		}
		boolean b = p.estPleine();
		assertEquals(false, b);
	}

	@Test
	public void empiler() {
		int[] tab = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		p.setP(tab);
		p.setSp(-1);
		try {
			p.empiler(50);
		} catch (PilePleineException e) {
			e.printStackTrace();
		}
		int[] tabResultat = { 50, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		assertArrayEquals(tabResultat, p.getP());
		assertEquals(0, p.getSp());
	}

}
