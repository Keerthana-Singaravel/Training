package Day13.Tests;

import Day13.Main.Reverse;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class ReverseTests {
    Reverse s;
    @Before
    public void setUp() throws Exception{
        s= new Reverse();
    }
    @After
    public void Test(){
        String res=s.reverse("Apple");
        assertEquals("elppA",res);

        res=s.reverse("{}(.;'/,)=-");
        assertEquals("-=),/';.(}{",res);

        res=s.reverse("234rfd");
        assertEquals("dfr432",res);

        res=s.reverse("a");
        assertEquals("a",res);
    }
    @After
    public void Test_Empty(){
        String res=s.reverse(" ");
        assertEquals("String is empty... ",res);
    }

}
