// DummyService.java, created by Fabio Strozzi on Mar 27, 2011
package eu.fabiostrozzi.guicejunitrunner;

import com.google.inject.Inject;

/**
 * @author Fabio Strozzi
 * 
 */
public class DummyService implements IService {

    private IComponent component;

    /**
     * @param component
     *            the component to set
     */
    @Inject
    public void setComponent(IComponent component) {
        this.component = component;
    }

    /*
     * (non-Javadoc)
     * 
     * @see eu.fabiostrozzi.guicejunitrunner.IService#doSomething()
     */
    public String doSomething() {
        return component.compute();
    }

}
