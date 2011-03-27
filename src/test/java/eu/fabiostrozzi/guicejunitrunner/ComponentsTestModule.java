// TestModule.java, created by Fabio Strozzi on Mar 27, 2011
package eu.fabiostrozzi.guicejunitrunner;

import com.google.inject.AbstractModule;

import eu.fabiostrozzi.guicejunitrunner.DummyComponent;
import eu.fabiostrozzi.guicejunitrunner.IComponent;

/**
 * A trivial Guice configuration.
 * 
 * @author Fabio Strozzi
 */
public class ComponentsTestModule extends AbstractModule {

    /*
     * (non-Javadoc)
     * 
     * @see com.google.inject.AbstractModule#configure()
     */
    @Override
    protected void configure() {
        bind(IComponent.class).to(DummyComponent.class);
    }

}
