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

/**
 * Class with one main dependency
 *
 * @author Gualtiero Testa <www.gualtierotesta.it>
 */
public class TheClass {

    private final ADependency dependency;

    public TheClass(ADependency pDependency) {
        this.dependency = pDependency;
    }

    /**
     * Creates the message on how many users are logged now
     *
     * @return a string with the message
     */
    public String loggerUsersMessage() {
        String res;
        int num = dependency.countLoggedUsers();
        switch (num) {
            case 0:
                res = "Nobody connected";
                break;
            case 1:
                res = "One logged user";
                break;
            default:
                res = num + " logged users";
        }
        return res;
    }
}
