package sk.binarygap;

public class BinaryGap {

	public static void main(String[] args) {
		BinaryGap b = new BinaryGap();
		b.init();
	}

	private void init() {
		System.out.println(solution2(17));
		System.out.println(solution(17));
		System.out.println(solution1(17));
		System.out.println(solution3(17));
		System.out.println(solution4(17));
		System.out.println(solution5(17));
	}

	public int solution3(int N) {
		int n = 0;
		String s = Integer.toBinaryString(N);
		String comp = "0";
		for (int i = 0; i < 29; i++) { // 29 car en transformant les int en
										// binaire on peut au maw avoir 29 zeros
										// car 2^32-1 et le plus gros chiffres
										// serait 1 puis 29 zeros et 1.
			if (s.contains(comp)) {
				n++;
			} else {
				break;
			}
			comp += "0";
		}
		System.out.println(s);
		return n;
	}

	public int solution2(int N) {
		int n = 0;
		String s = Integer.toBinaryString(N);
		int i = 0;
		for (i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equals("1")) {
				break;
			}
		}
		int cpt = 0;
		for (int j = i + 1; j < s.length(); j++) {
			if (s.substring(j, j + 1).equals("0")) {
				cpt++;
			} else {
				if (cpt > n) {
					n = cpt;
				}
				cpt = 0;
			}
		}
		return n;
	}

	public int solution(int N) {

		int n = 0;
		String s = Integer.toBinaryString(N);
		s = s.replace("0", " "); // On remplace les 0 par des espaces pour
									// pouvoir utiliser le trm apres et donc
									// supprimer tous les premiers et derniers
									// blancs
		s = s.trim();
		String[] ls = s.split("1"); // split : Considere que 1 est un séparateur
		for (int i = 0; i < ls.length; i++) {
			n = Math.max(ls[i].length(), n);
		}
		System.out.println(s);

		return n;
	}

	public int solution1(int N) {
		int n = 0;
		int cpt = 0;
		boolean demarre = false;
		while (N > 0) {
			int reste = N % 2;
			if (reste == 1) {
				if (!demarre) {
					n = 0;
					demarre = true;
				} else {
					n = Math.max(n, cpt);
				}
				cpt = 0;
			} else {
				cpt++;
			}
			N = N / 2;
		}
		return n;
	}

	public int solution4(int N) {
		int n = 0;
		String s = Integer.toBinaryString(N);
		int debut = s.indexOf("1");
		int suivant = debut;
		boolean sortir = false;
		while (!sortir) {
			suivant = s.indexOf("1", debut + 1);
			if (suivant < 0) {
				sortir = true;
			} else {
				int val = (suivant - debut - 1);
				if (n < val) {
					n = val;
				}
				debut = suivant;
			}
		}
		System.out.println(s);
		return n;
	}

	public int solution5(int N) {
		int n = 0;
		String s = Integer.toBinaryString(N);
		s = s.replace("0", " ");
		s = s.trim();
		System.out.println(s);
		int lgr = s.length();
		while (lgr > 1) {
			s = s.substring(1, s.length() - 1);
			lgr = s.length();
		}
		return n;
	}
}
