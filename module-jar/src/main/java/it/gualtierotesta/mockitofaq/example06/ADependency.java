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
 * Example of a dependency
 *
 * @author Gualtiero Testa <www.gualtierotesta.it>
 */
interface ADependency {

    /**
     * Save the user data somewhere
     *
     * @param theUser the user to be saved
     */
    void saveUser(User theUser);

    /**
     * Save the name of the last logged user
     *
     * @param userName the name of the user
     */
    void saveLastLoggedUser(String userName);

    /**
     * Check if user can login
     *
     * @param userName user name
     * @param password user password
     * @return true if can login, false otherwise
     */
    boolean canLogin(String userName, String password);

}
