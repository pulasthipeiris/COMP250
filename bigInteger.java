import java.math.BigInteger;

/*
Example of using BigInteger class
 */

public class bigInteger {

    public static BigInteger factorial (int N){
        BigInteger f = new BigInteger("1");

        for(int i = 2; i <= N; i ++){
            f = f.multiply(BigInteger.valueOf(i));
        }

        return f;
    }

    public static void main(String[] args){
        System.out.println(factorial(20));
    }
}
