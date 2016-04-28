import java.util.ArrayList;

public class CountSemiPrimes {

	public static void main(String[] args) {

		CountSemiPrimes count = new CountSemiPrimes();
		count.init();
		// System.out.println(count.solution(26, null, null));
	}

	public void init() {

		int[] A = { 1, 4, 16 };
		int[] B = { 26, 10, 20 };
		int N = 26;

		ArrayList<Integer> listPrime = rechercherNbPremier(N);
		ArrayList<Integer> listSemi = calculSemiPremier(listPrime, N);
		int[] resultat = calculNbSemiPremier(listSemi);
		for (int i = 0; i < resultat.length; i++) {
			System.out.println(resultat[i]);
		}

	}

	private ArrayList<Integer> rechercherNbPremier(int N) {
		ArrayList<Integer> listPrime = new ArrayList<Integer>();

		for (int i = 2; i < N; i++) {
			boolean b = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					b = false;
					// System.out.println("ce n'est pas un nb premier " + i);
					break;
				}
			}
			if (b) {
				listPrime.add(i);
			}

		}
		for (Integer integer : listPrime) {
			System.out.print(integer + ",");
		}
		System.out.println();
		return listPrime;
	}

	private ArrayList<Integer> calculSemiPremier(ArrayList<Integer> listPrime, int N) {
		ArrayList<Integer> listSemi = new ArrayList<Integer>();
		for (int i = 0; i < listPrime.size(); i++) {
			for (int j = i; j < listPrime.size(); j++) {
				int valI = listPrime.get(i);
				int valJ = listPrime.get(j);
				int calcul = valI * valJ;
				if (calcul <= N) {
					listSemi.add(calcul);

				}

			}

		}
		for (Integer integer : listSemi) {
			System.out.print(integer + ",");
		}
		return listSemi;

	}

	private int[] calculNbSemiPremier(ArrayList<Integer> listSemi) {

		int[] P = { 1, 4, 16 };
		int[] Q = { 26, 10, 20 };
		int cpt = 0;
		int[] resultat = new int[P.length];

		for (int i = 0; i < Q.length; i++) {
			cpt = 0;
			for (int j = P[i]; j <= Q[i]; j++) {
				if (listSemi.contains(j)) {
					cpt++;
				}
			}
			resultat[i] = cpt;
		}
		return resultat;

	}
}
