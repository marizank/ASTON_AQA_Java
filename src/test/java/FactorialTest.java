import org.example.Factorial;
import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void CheckFactorialEquals6(){
        Factorial equal =new Factorial();
        Assert.assertEquals(720, equal.factorial(6));
    }
    @Test
    public void CheckFactorialEquals1(){
        Factorial equal=new Factorial();
        Assert.assertEquals(1, equal.factorial(1));
    }
    @Test
    public void CheckFactorialEquals0(){
        Factorial equal=new Factorial();
        Assert.assertEquals(1 , equal.factorial(0));
    }
}
