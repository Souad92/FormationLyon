
public class EquiLeader {
	public static void main(String[] args) {
		EquiLeader equiLeader = new EquiLeader();
		equiLeader.init();
	}

	public void init() {
		int[] A = { 4, 3, 4, 4, 4, 2 };

		System.out.println(solution(A));
	}

	public int solution(int A[]) {
		int equi_leaders = 0;

		// first, compute the leader
		int leader = A[0];
		int ctr = 1;

		for (int i = 1; i < A.length; i++) {
			if (A[i] == leader) {
				ctr++;
			} else {
				ctr--;
			}
			if (ctr == 0) {
				ctr = 1;
				leader = A[i];
			}
		}

		// check if it's a leader?
		int total = 0;

		for (int i = 0; i < A.length; i++) {
			if (i == leader) {
				total++;
			}
		}

		if (total <= (A.length / 2)) {
			return 0; // impossible
		}
		int ldrCount = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == leader) {
				ldrCount++;
			}
			int leadersInRightPart = (total - ldrCount);
			if (ldrCount > (i + 1) / 2 && leadersInRightPart > (A.length - i - 1) / 2) {
				equi_leaders++;
			}
		}

		return equi_leaders;

	}
}
