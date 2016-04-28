
public class DemoCodility {

	public static void main(String[] args) {
		DemoCodility test = new DemoCodility();
		int[] a = { -1, 3, -4, 5, 1, -6, 2, 1 };
		int rep = test.solution(a);
		System.out.println(rep);
		a = new int[100000];
		int indice;
	}

	public int solution(int[] A) {
		int res = -1;
		for (int i = 0; i < A.length; i++) {
			int s1 = 0;
			int s2 = 0;
			for (int j = 0; j < i; j++) {
				s1 += A[j];
			}
			for (int j = i + 1; j < A.length; j++) {
				s2 += A[j];
			}
			if (s1 == s2) {
				res = i;
				break;
			}
		}
		return res;
	}

	class Solution {
		public int solution(int X, int Y, int D) {
	        // write your code in Java SE 8
	        int saut=0; 
	        if (((Y-X)%D) == 0) {
	        	saut= ((Y-X)/D);
	        } else { 
	           saut = ((int) ((Y-X)/D)+1);
	        }
	        return saut;
	    }
	}
}
