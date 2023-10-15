import org.example.Factorial;
import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

        @Test
        public void checkFactorialEquals6() {
            Factorial equal = new Factorial();
            Assert.assertEquals(720L, (long)equal.factorial(6));
        }

        @Test
        public void checkFactorialEquals1() {
            Factorial equal = new Factorial();
            Assert.assertEquals(1L, (long)equal.factorial(1));
        }

        @Test
        public void checkFactorialEquals0() {
            Factorial equal = new Factorial();
            Assert.assertEquals(1L, (long)equal.factorial(0));
        }
}
