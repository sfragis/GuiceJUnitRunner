/**
 * Copyright (C) 2011 Fabio Strozzi (fabio.strozzi@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
