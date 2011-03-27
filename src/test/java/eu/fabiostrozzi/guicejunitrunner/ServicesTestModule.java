// TestModule.java, created by Fabio Strozzi on Mar 27, 2011
package eu.fabiostrozzi.guicejunitrunner;

import com.google.inject.AbstractModule;

import eu.fabiostrozzi.guicejunitrunner.DummyService;
import eu.fabiostrozzi.guicejunitrunner.IService;

/**
 * A trivial Guice configuration.
 * 
 * @author Fabio Strozzi
 */
public class ServicesTestModule extends AbstractModule {

    /*
     * (non-Javadoc)
     * 
     * @see com.google.inject.AbstractModule#configure()
     */
    @Override
    protected void configure() {
        bind(IService.class).to(DummyService.class);
    }

}
