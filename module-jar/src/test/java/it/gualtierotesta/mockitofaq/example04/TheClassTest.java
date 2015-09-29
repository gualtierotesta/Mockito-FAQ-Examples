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
package it.gualtierotesta.mockitofaq.example04;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * EXAMPLE 04
 *
 * Unit test (see EXAMPLE01 for complete use cases tests
 *
 * @author Gualtiero Testa <www.gualtierotesta.it>
 */
@RunWith(MockitoJUnitRunner.class)
public class TheClassTest {

    @InjectMocks
    private TheClass sut;   // system under test

    @Mock
    private ADependency dependency;

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

}
