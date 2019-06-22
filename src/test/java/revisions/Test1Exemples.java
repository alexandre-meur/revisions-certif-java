package revisions;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import revisions.test1Model.q1.Base;
import revisions.test1Model.q2.AppQ2;
import revisions.test1Model.q3.AppQ3;
import revisions.test1Model.q8.AppQ8;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Test1Exemples {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    /**
     * On change les flux de sortie pour pouvoir les tester
     */
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    /**
     * On restaure les flux quand on a fini
     */
    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void test1(){
        Base.main(null);
        Assert.assertEquals("Derived B Derived B ", outContent.toString());
    }

    @Test
    public void test2(){
        AppQ2.mainA(null);
        Assert.assertNotEquals("Equal", outContent.toString());
        outContent.reset();
        AppQ2.mainB(null);
        Assert.assertEquals("Equal", outContent.toString());
        outContent.reset();
        AppQ2.mainC(null);
        Assert.assertNotEquals("Equal", outContent.toString());
        outContent.reset();
        AppQ2.mainD(null);
        Assert.assertNotEquals("Equal", outContent.toString());
    }

    @Test(expected = Error.class)
    public void test3() {
        AppQ3.main(null);
    }

    @Test
    public void test8() {
        AppQ8.main(null);
        Assert.assertEquals("1 2 3 4 5 5 4 3 2 1 1 3 5 2 4", outContent.toString());
    }
}
