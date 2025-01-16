package Day13.Tests;

import Day13.Main.PrimeChecker;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeChecker_Test {
    PrimeChecker primeChecker;

    @Before
    public void setUp() throws Exception {
        primeChecker = new PrimeChecker();
    }

    @Test
    public void testPrime_positivePrimeNumbers() {
        String res = primeChecker.isPrime(2);
        assertEquals("Prime number.", res);

        res = primeChecker.isPrime(13);
        assertEquals("Prime number.", res);

        res = primeChecker.isPrime(97);
        assertEquals("Prime number.", res);
    }

    @Test
    public void testPrime_positiveNonPrimeNumbers() {
        String res = primeChecker.isPrime(10);
        assertEquals("Not a prime number.", res);

        res = primeChecker.isPrime(100);
        assertEquals("Not a prime number.", res);
    }

    @Test
    public void testPrime_edgeCases() {
        String res = primeChecker.isPrime(0);
        assertEquals("Not a prime number.", res);

        res = primeChecker.isPrime(1);
        assertEquals("Not a prime number.", res);

        res = primeChecker.isPrime(-5);
        assertEquals("Not a prime number.", res);
    }

    @Test
    public void testPrime_largePrime() {
        String res = primeChecker.isPrime(7919);
        assertEquals("Prime number.", res);
    }

    @Test
    public void testPrime_largeNonPrime() {
        String res = primeChecker.isPrime(8000);
        assertEquals("Not a prime number.", res);
    }
}
