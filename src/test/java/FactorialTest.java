import org.example.Factorial;
import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void CheckFactorialEquals(){
        Factorial nq=new Factorial();
        Assert.assertEquals(720, nq.factorial(6));
    }
}
