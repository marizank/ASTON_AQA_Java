import org.example.Factorial;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFactorial {
    @Test
    public void CheckFactorialEquals(){
        Factorial nq=new Factorial();
        Assert.assertEquals(5040, nq.factorial(7));
    }
}
