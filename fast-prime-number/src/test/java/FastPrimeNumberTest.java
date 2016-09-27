import org.junit.Assert;
import org.junit.Test;

public class FastPrimeNumberTest {

	@Test
	public void test01() {
		final int input = 3;
		Assert.assertTrue(FastPrimeNumber.isPrime(input));
	}

	@Test
	public void test02() {
		final int input = 123321;
		Assert.assertFalse(FastPrimeNumber.isPrime(input));
	}

	@Test
	public void test03() {
		final int input = 123;
		Assert.assertFalse(FastPrimeNumber.isPrime(input));
	}

	@Test
	public void test04() {
		final int input = 103;
		Assert.assertTrue(FastPrimeNumber.isPrime(input));
	}

}
