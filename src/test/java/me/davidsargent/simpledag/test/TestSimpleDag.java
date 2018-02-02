package me.davidsargent.simpledag.test;

import me.davidsargent.simpledag.SimpleDag;
import me.davidsargent.simpledag.test.clazzes.SimpleClass;
import org.junit.Assert;
import org.junit.Test;



public class TestSimpleDag {
    @Test
    public void testCreateSimpleClass() {
        SimpleClass simpleDagClass = SimpleDag.create(SimpleClass.class);
        Assert.assertTrue("created class is null", simpleDagClass != null);
    }

    @Test(expected = NullPointerException.class)
    public void testTryToCreateNull() {
        SimpleDag.create(null);
    }
}
