import java.math.BigInteger;
public class Task1_4_8 {
    public static void main(String[] args) {

        System.out.println(factorial(1));

    }

    public static BigInteger factorial(int value) {
        if (value <= 1) {
            return BigInteger.valueOf(1);
        } else {
            BigInteger bigInteger = BigInteger.valueOf(value * (value - 1));
            return bigInteger;
        }
    }
}