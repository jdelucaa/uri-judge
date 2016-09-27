import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FastPrimeNumber {

	public static void main(final String[] args) throws IOException {
		final InputStreamReader ir = new InputStreamReader(System.in);
		final BufferedReader in = new BufferedReader(ir);

		final int firstInput = Integer.parseInt(in.readLine());

		for (int i = 0; i < firstInput; i++) {
			final int nextInput = Integer.parseInt(in.readLine());
			if (isPrime(nextInput)) {
				System.out.println("Prime");
			} else {
				System.out.println("Not Prime");
			}
		}
	}

	public static boolean isPrime(final int nextInput) {
		if (nextInput != 2 && (nextInput % 2) == 0) {
			return false;
		}

		final double max = Math.sqrt(nextInput);

		for (int i = 3; i < max; i += 2) {
			if (nextInput % i == 0) {
				return false;
			}
		}
		return true;
	}

}
