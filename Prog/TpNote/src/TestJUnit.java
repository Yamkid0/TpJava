import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * 
 * @author kille
 *
 */
public class TestJUnit {
	@ParameterizedTest
	@ValueSource(ints = {1,2})
	public void testJu(int test) {
		System.out.println("test" + test);
		assertEquals(test,test);
	}
}
