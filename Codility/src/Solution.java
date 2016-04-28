class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();

		System.out.println(solution.solution(10, 4));
	}

	public int solution(int N, int M) {
		// write your code in Java SE 8

		int[] tab = new int[N];
		int i = 0;
		int cpt = 0;
		while (tab[i] == 0) {
			tab[i] = 1;
			cpt++;
			i += M;
			i = i % N;

		}
		return cpt;
	}

}