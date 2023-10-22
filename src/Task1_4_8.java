import java.math.BigInteger;
public class Task1_4_8 {
    public static void main(String[] args) {

        System.out.println();
        long b = 5;
        factorial(b);

    }
    public static BigInteger factorial(long value) {
        BigInteger result = BigInteger.ONE;

        for (long b = 5; b < value; b++)
            result = result.multiply(BigInteger.valueOf(b));

        return result;
    }
}