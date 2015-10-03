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
package it.gualtierotesta.mockitofaq.example06;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * EXAMPLE 06 Unit test
 *
 * @author Gualtiero Testa <www.gualtierotesta.it>
 */
@RunWith(MockitoJUnitRunner.class)
public class TheClassTest {

    @InjectMocks
    private TheClass sut;

    @Mock
    private ADependency dependency;

    @Test
    public void test1() {
        // given
        final String firstName = "Luigi";
        final String familyName = "Mario";
        final int age = 45;
        // when
        sut.createNewUser(firstName, familyName, age);
        // then
        Mockito.verify(dependency).saveUser(Mockito.any(User.class));
    }

    @Test
    public void test2() {
        // given
        final String firstName = "Luigi";
        final String familyName = "Mario";
        final int age = 45;
        final User expectedUser = new User(familyName + ' ' + firstName, 45);
        // when
        sut.createNewUser(firstName, familyName, age);
        // then
        Mockito.verify(dependency).saveUser(expectedUser);
    }

    @Test
    public void test3() {
        // given
        final String firstName = "Luigi";
        final String familyName = "Mario";
        final int age = 45;
        ArgumentCaptor<User> capUser = ArgumentCaptor.forClass(User.class);
        // when
        sut.createNewUser(firstName, familyName, age);
        // then
        Mockito.verify(dependency).saveUser(capUser.capture());
        User capturedUser = capUser.getValue();
        Assert.assertThat(capturedUser.getAge(), CoreMatchers.is(age));
        Assert.assertThat(capturedUser.getName(),
                CoreMatchers.allOf(
                        CoreMatchers.startsWith(familyName),
                        CoreMatchers.endsWith(firstName)
                )
        );
    }

}
