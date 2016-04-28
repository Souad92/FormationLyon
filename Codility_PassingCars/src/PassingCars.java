
public class PassingCars {
	class Solution {
		public int solution(int[] A) {
			// write your code in Java SE 8
			int cpt1 = 0;
			int cpt2 = 0;
			int max = 1000000000;

			for (int i = 0; i < A.length; i++) {
				if (A[i] == 0) {
					cpt1++;
				} else if (A[i] == 1) {
					cpt2 += cpt1;
				}
				if (cpt2 > max) {
					return -1;
				}
			}
			return cpt2;
		}
	}
}
