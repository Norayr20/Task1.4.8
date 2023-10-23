import java.math.BigInteger;
public class Task1_4_8 {
    public static void main(String[] args) {

        System.out.println(factorial(2));

    }
    public static BigInteger factorial(long value) {
        BigInteger result = BigInteger.TWO;

        for (long b = 2; b < value; b++)
            result = result.multiply(BigInteger.valueOf(b));

        return result;
    }
}