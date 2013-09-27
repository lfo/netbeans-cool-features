package org.laurentforet.samples.moduleb;


import org.laurentforet.samples.module.ServiceA;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class ModuleACoSDependencyTest  {

    @Test
    public void simpleTest() {
        Assert.assertEquals(new ServiceA().getHello(), "serviceA");
    }
}
