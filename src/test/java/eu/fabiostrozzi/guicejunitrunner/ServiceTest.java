// ServiceTest.java, created by Fabio Strozzi on Mar 27, 2011
package eu.fabiostrozzi.guicejunitrunner;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

import eu.fabiostrozzi.guicejunitrunner.IService;
import eu.fabiostrozzi.guicejunitrunner.GuiceJUnitRunner.GuiceModules;

/**
 * Unit test for simple App.
 */
@RunWith(GuiceJUnitRunner.class)
@GuiceModules({ ComponentsTestModule.class, ServicesTestModule.class })
public class ServiceTest {
    private IService service;
    
    

    /**
     * @param service the service to set
     */
    @Inject
    public void setService(IService service) {
        this.service = service;
    }



    @Test
    public void testApp() {
        Assert.assertEquals("Hello World!", service.doSomething());
    }
}
