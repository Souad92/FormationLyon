package sk.autre;

public class TestString {
	public static void main(String[] args) {
		TestString testString = new TestString();
		testString.init();

	}

	public void init() {
		String s1 = "Mon premier String";
		String s2 = "mon premier String";
		int lng = s1.length();
		int lng2 = "mon premeier String".length();
		boolean b1 = s1.equals("mon premier String");
		int comp1 = "A".compareTo("a");
		System.out.println(comp1);
		char[] tab = s1.toCharArray(); // transforme la chaine de caractere en
										// tableau de char
		System.out.println(tab);
		int majuscule = 'A';
		int minuscule = 'a';
		System.out.println(majuscule + " " + minuscule + " " + (majuscule - minuscule));
		System.out.println(s1.toUpperCase().replace("PRE", "PER").substring(3, 7));
		s1 = s1.replace("String", "coucou");
		System.out.println(s1);
		if (s1.contains("pre")) {
			System.out.println("Contenu");
		} else {
			System.out.println("NON Contenu");
		}
		int ind1 = s1.indexOf("c"); // cherche le 1er c de la phrase s1 qui a
									// déja remplacé String par coucou en
									// commençant par la gauche et par 0
		int ind2 = s1.lastIndexOf("c"); // cherche le 1er c qu'il trouve en
										// partant par la droite et donne le
										// numéro de sa postion: dans la phrase
										// "mon premier coucou", le premier c en
										// partant de la droite est à la 15éme
										// position (on compte les espaces et on
										// commence à 0)
		System.out.println(ind1 + " " + ind2);
		byte[] b = s1.getBytes(); // transcription des codes successifs des
									// chaines de caractéres, transforme en byte
									// les chaines de caracteres
		System.out.println(b.length);// nombre de caracteres
		System.out.println(s1.substring(4, 11));// prend les caracteres de 4 à
												// 11

		int i = Integer.valueOf("45678"); // permet de passer d'un int à un
											// string (changer le type de
											// variable)
		System.out.println(i);
		String sI = Integer.toString(i); // inverse de Integer
		System.out.println(sI);
		System.out.println(Integer.toHexString(i));
		System.out.println(Integer.toBinaryString(i));
		int j = new Integer(5).intValue();

		Integer i1 = new Integer(5);
		Integer i2 = new Integer(5);
		int a = 4;
		System.out.println(a);
		if (i1.equals(i2)) {
			System.out.println("Perdu");
		} else {
			System.out.println("Gagné");
		}
		int k = i1.intValue();
	}

}
