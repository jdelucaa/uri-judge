import org.junit.Assert;
import org.junit.Test;

public class InDangerTest {

	@Test
	public void test01() {
		final Double rebels = 01e0;
		Assert.assertEquals(1, InDanger.getSafeSpot(rebels.intValue()));
	}

	@Test
	public void test02() {
		final Double rebels = 02e0;
		Assert.assertEquals(1, InDanger.getSafeSpot(rebels.intValue()));
	}

	@Test
	public void test03() {
		final Double rebels = 05e0;
		Assert.assertEquals(3, InDanger.getSafeSpot(rebels.intValue()));
	}

	@Test
	public void test04() {
		final Double rebels = 01e1;
		Assert.assertEquals(5, InDanger.getSafeSpot(rebels.intValue()));
	}

	@Test
	public void test05() {
		final Double rebels = 42e0;
		Assert.assertEquals(21, InDanger.getSafeSpot(rebels.intValue()));
	}

	@Test
	public void test06() {
		final Double rebels = 66e6;
		Assert.assertEquals(64891137, InDanger.getSafeSpot(rebels.intValue()));
	}

}
