package Day47;

import Day46.StringSetImplementation.StringSet;
import Day46.StringSetImplementation.StringSetImplementation1;
import org.junit.Assert;
import org.junit.Test;
public class TestStringSetWithJUnit {

    @Test
    public void test1(){
        StringSet set = new StringSetImplementation1();
        set.add("Hello");
        int expected = 1;
        Assert.assertEquals(expected,set.size());

    }

    @Test
    public void test2() {
        StringSet set = new StringSetImplementation1();
        set.add("Hello");
        set.remove("Hello");

        Assert.assertEquals(0,set.size());
    }


    @Test
    public void test3() {
        StringSet set = new StringSetImplementation1();
        set.add("Hello");
        set.add("Hello");

        Assert.assertEquals(1,set.size());



    }
}
