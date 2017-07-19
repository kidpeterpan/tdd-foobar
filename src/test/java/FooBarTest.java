import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class FooBarTest {

    @Test
    @Parameters({"1,1",
            "2,2",
            "3,Foo",
            "6,Foo",
            "5,Bar",
            "10,Bar",
            "15,FooBar",
            "30,FooBar"})
    public void resultShouldBeExpectedValue(int input, String expected) throws Exception {
        FooBar fooBar = new FooBar(input);
        Assert.assertEquals(expected, fooBar.getResult());
    }
}
