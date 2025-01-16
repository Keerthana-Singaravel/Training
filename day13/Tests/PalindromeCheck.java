package Day13.Tests;

import Day13.Main.StrPalindrome;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class PalindromeCheck {

    StrPalindrome s;
    @Before
    public void setUp() throws Exception{
        s= new StrPalindrome();
    }
    @After
    public void Test(){
        String res=s.palindrome("Apple");
        assertEquals("Not palindrome",res);

        res=s.palindrome("racecar");
        assertEquals("palindrome",res);

        res=s.palindrome("234rfd");
        assertEquals("Not palindrome",res);

        res=s.palindrome("a");
        assertEquals("palindrome",res);
    }
    @After
    public void Test_Empty(){
        String res=s.palindrome(" ");
        assertEquals("String is empty... ",res);
    }

}

