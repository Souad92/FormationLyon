import java.util.ArrayList;

public class FibFrog {

	public static void main(String[] args) {
		FibFrog fibFrog = new FibFrog();
		fibFrog.init();

	}

	private void init() {
		int[] A = { 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0 };
		int[] B = new int[A.length + 1];
		B[0] = 0;
		B[1] = 1;
		for (int i = 0; i < A.length; i++) {
			if (i >= 2) {
				B[i] = B[i - 1] + B[i - 2];
			}

		}
	}

	public int solution(int[] A) {

		int res = 0;
		ArrayList<Integer> f = creFib(A.length);
		ArrayList<Integer> positionsDeDepart = new ArrayList<Integer>();
		positionsDeDepart.add(-1);

		ArrayList<Integer> posTrouvee = null;
		while (positionsDeDepart.size() > 0) {
			posTrouvee = rechercherPosPossible(f, A, positionsDeDepart);
			res++;
			if (posTrouvee.get(posTrouvee.size() - 1) == A.length) {
				// Arrivee
				System.out.println("La frog est arrivée");
				res++;
				break;
			} else {
				// Charger position de départ
				positionsDeDepart.clear();
				positionsDeDepart.addAll(posTrouvee);
				posTrouvee.clear();
			}
		}
		return res;

	}

	public ArrayList<Integer> rechercherPosPossible(ArrayList<Integer> f, int[] A, ArrayList<Integer> positionsDeDepart) {
		ArrayList<Integer> positionsTouvees = new ArrayList<Integer>();
		// partir de toutes les positions actuelles
		sortie: for (Integer posDebut : positionsDeDepart) {
			// rechercher suivant la suite de fibonacci les sauts possibles
			for (Integer nbFibonacci : f) {
				int saut = posDebut + nbFibonacci;
				if (saut < A.length) {
					if (A[saut] == 1) {
						positionsTouvees.add(saut);
					}
				} else {
					if (saut == A.length) {
						positionsTouvees.add(saut);
						break sortie;
					} else {
						break;
					}
				}
			}
		}
		return positionsTouvees;
	}

	private ArrayList<Integer> creFib(int len) {
		ArrayList<Integer> f = new ArrayList<Integer>();
		// v1= N-2, v2= N-1, v3= N.
		int v1 = 1;
		int v2 = 2;
		f.add(v1);
		f.add(v2);
		int v3 = v1 + v2;
		while (v3 <= len) {
			f.add(v3);
			v1 = v2;
			v2 = v3;
			v3 = v1 + v2;
		}

		return f;
	}

}
