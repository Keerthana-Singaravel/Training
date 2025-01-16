package Day13.Main;

public class PrimeChecker {
    public String isPrime(int n) {
        if (n <= 1) {
            return "Not a prime number.";
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return "Not a prime number.";
            }
        }
        return "Prime number.";
    }

    public static void main(String[] args) {
        PrimeChecker primeChecker = new PrimeChecker();
        System.out.println(primeChecker.isPrime(2));
        System.out.println(primeChecker.isPrime(10));
        System.out.println(primeChecker.isPrime(-5));
        System.out.println(primeChecker.isPrime(0));
        System.out.println(primeChecker.isPrime(1));
        System.out.println(primeChecker.isPrime(13));
        System.out.println(primeChecker.isPrime(97));
        System.out.println(primeChecker.isPrime(100));
    }
}
