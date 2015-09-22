/*
 * Copyright 2015 Gualtiero Testa.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package it.gualtierotesta.mockitofaq.example01;

import org.hamcrest.CoreMatchers;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * EXAMPLE 01
 *
 * Unit test
 *
 * @author Gualtiero Testa <www.gualtierotesta.it>
 */
public class TheClassTest {

    private TheClass sut;   // system under test
    private ADependency dependency;

    @Before
    public void before() {

        // Create the dependency mock
        dependency = Mockito.mock(ADependency.class);

        // Create the sut injecting the dependency
        sut = new TheClass(dependency);
    }

    @Test
    public void testCaseNoUsers() {
        // given
        int loggedUsers = 0;
        // NOTE: The line below is not strictly necessary because of default Mockito stubbed methods return value.
        // A method which returns an int will always return 0 in a mock if not stubbed with Mockito.when
        Mockito.when(dependency.countLoggedUsers()).thenReturn(loggedUsers);
        // when
        String result = sut.loggerUsersMessage();
        // then
        Assert.assertThat(result, Is.is("Nobody connected"));
    }

    @Test
    public void testCaseOneUser() {
        // given
        int loggedUsers = 1;
        Mockito.when(dependency.countLoggedUsers()).thenReturn(loggedUsers);
        // when
        String result = sut.loggerUsersMessage();
        // then
        Assert.assertThat(result, CoreMatchers.startsWith("One"));
    }

    @Test
    public void testCaseManyUser() {
        // given
        int loggedUsers = 123;  // Any number here
        Mockito.when(dependency.countLoggedUsers()).thenReturn(loggedUsers);
        // when
        String result = sut.loggerUsersMessage();
        // then
        Assert.assertThat(result,
                CoreMatchers.allOf(
                        CoreMatchers.startsWith(String.valueOf(loggedUsers)),
                        CoreMatchers.endsWith("users")));

    }

}
