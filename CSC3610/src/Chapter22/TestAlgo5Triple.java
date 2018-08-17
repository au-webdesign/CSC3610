package Chapter22;

public class TestAlgo5Triple {

	public static void main(String[] args) {
		int n = 100;
		int s1 = trip5(n);
		System.out.printf("\n - For n:%s res:%s", n, s1);

	}

	public static int trip5(int n) {
		int sum = 0;
		for (int i = 0; i < 2*n; i++) {
			System.out.printf("\ni:%s n:%s", i, n );
			for (int j = n - 1000; j < n; j++) {
				for (int k = n / 2; k < n; k++) {
					sum++;
				}
			}
		}
		return sum;
	}
}
