
public class MaxProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaxProfit maxProfit = new MaxProfit();
		maxProfit.init();
	}

	public void init() {
		int[] A = { 23171, 21011, 21123, 21366, 21013, 21367 };
		System.out.println(solution(A));
	}

	private long solution(int A[]) {

		long prixMin = A[0];
		long maxProfit = 0;

		for (int i = 0; i < A.length; i++) {
			maxProfit = Math.max(maxProfit, A[i] - prixMin);
			System.out.println(maxProfit);
			prixMin = Math.min(prixMin, A[i]);
			System.out.println(prixMin);
		}
		return maxProfit;
	}
}
