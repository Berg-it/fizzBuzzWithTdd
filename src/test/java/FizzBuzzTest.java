


// Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”

import com.bergit.fizzbuzz.FizzBuzzProcess;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void should_returnNumber(){
        FizzBuzzProcess fizzBuzzProcess = new FizzBuzzProcess();
        String result = fizzBuzzProcess.getResult(1);
        Assert.assertEquals("1", result);
    }

    @Test
    public void should_returnFizz(){
        FizzBuzzProcess fizzBuzzProcess = new FizzBuzzProcess();
        String result = fizzBuzzProcess.getResult(9);
        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void should_returnBuzz(){
        FizzBuzzProcess fizzBuzzProcess = new FizzBuzzProcess();
        String result = fizzBuzzProcess.getResult(10);
        Assert.assertEquals("Buzz", result);
    }

    @Test
    public void should_returnFizzBuzz(){
        FizzBuzzProcess fizzBuzzProcess = new FizzBuzzProcess();
        String result = fizzBuzzProcess.getResult(15);
        Assert.assertEquals("FizzBuzz", result);
    }


}
