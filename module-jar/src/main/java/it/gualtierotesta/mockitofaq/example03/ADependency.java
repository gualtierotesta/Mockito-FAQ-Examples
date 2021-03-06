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
package it.gualtierotesta.mockitofaq.example03;

/**
 * Example of a dependency
 *
 * @author Gualtiero Testa <www.gualtierotesta.it>
 */
public class ADependency {

    public int countLoggedUsers() {
        // This a dummy implementation.
        // Real implementation could connect to a DB or to a web service
        // to get the number of logged users
        return 5;
    }

}
