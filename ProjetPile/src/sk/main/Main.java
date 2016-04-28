package sk.main;

import sk.metier.Pile;
import sk.metier.PilePleineException;
import sk.metier.PileVideException;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.init();
	}

	public void init() {

		int[] tab = new int[10];
		Pile pilou = new Pile();
		try {
			pilou.empiler(3);
		} catch (PilePleineException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Pile pile1 = new Pile(tab, 2);
		try {
			pilou.depiler();
		} catch (PileVideException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pilou.estVide();
		System.out.println("pilou est vide? " + pilou.estVide());
		for (int i = 0; i < 9; i++) {
			try {
				pilou.empiler(i);
			} catch (PilePleineException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(pilou.estPleine());
		for (int i = 0; i < 9; i++) {
			try {
				pilou.depiler();
			} catch (PileVideException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
