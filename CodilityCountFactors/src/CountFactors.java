
public class CountFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CountFactors contFactors = new CountFactors();
		contFactors.solution(24);
		System.out.println(contFactors.solution(24));
	}

	public int solution(int N) {
		int cpt = 0;
		for (int i = 1; i < N + 1; i++) {
			if (N % i == 0) {
				cpt++;
			}
		}
		return cpt;

	}
}
