package org.laurentforet.samples.moduleb;


import junit.framework.Assert;
import org.junit.Test;
import org.laurentforet.samples.module.ServiceA;

/**
 * Unit test for simple App.
 */
public class ModuleACoSDependencyTest  {

    @Test
    public void simpleTest() {
        Assert.assertEquals("serviceA", new ServiceA().getHello());
    }
}
