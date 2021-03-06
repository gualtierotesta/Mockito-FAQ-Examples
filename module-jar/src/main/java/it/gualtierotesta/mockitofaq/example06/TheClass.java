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

/**
 * Class with one main dependency
 *
 * @author Gualtiero Testa <www.gualtierotesta.it>
 */
class TheClass {

    private final ADependency dependency;

    TheClass(ADependency pDependency) {
        this.dependency = pDependency;
    }

    void createNewUser(String pFirstName, String pFamilyName, int pAge) {
        String name = pFamilyName + ' ' + pFirstName;
        User user = new User(name, pAge);
        dependency.saveUser(user);
    }

    boolean canUserLogin(String userName, String password) {
        boolean result = false;
        if (dependency.canLogin(userName, password)) {
            dependency.saveLastLoggedUser(userName);
            result = true;
        }
        return result;
    }

}
