import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InDanger {

	public static void main(final String[] args) throws IOException {
		final InputStreamReader ir = new InputStreamReader(System.in);
		final BufferedReader in = new BufferedReader(ir);

		Double numberOfRebels = Double.parseDouble(in.readLine());

		if (!numberOfRebels.equals(0.0)) {
			while (!numberOfRebels.equals(0.0)) {
				System.out.println(getSafeSpot(numberOfRebels.intValue()));
				numberOfRebels = Double.parseDouble(in.readLine());
			}
		}

	}

	public static int getSafeSpot(final int numberOfRebels) {
		final int highestOneBit = numberOfRebels - Integer.highestOneBit(numberOfRebels);
		return 2 * highestOneBit + 1;
	}

}
