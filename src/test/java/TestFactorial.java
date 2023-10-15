import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFactorial {
    @Test
    public void checkFactorialEquals1(){
        Factorial equal=new Factorial();
        Assert.assertEquals(1, equal.factorial(1));
    }
    @Test
    public void checkFactorialEquals0(){
        Factorial equal=new Factorial();
        Assert.assertEquals(1 , equal.factorial(0));
    }
    @Test
    public void checkFactorialEquals6(){
        Factorial equal=new Factorial();
        Assert.assertEquals(720, equal.factorial(6));
    }
}