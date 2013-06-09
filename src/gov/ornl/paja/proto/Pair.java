/**
 * Copyright 2013 Oak Ridge National Laboratory
 * Author: James Horey <horeyjl@ornl.gov>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package gov.ornl.paja.proto;

/**
 * Simple Pair class. 
 */
public class Pair<A, B> {
    public A a;
    public B b;

    public Pair(A a, B b) {
	this.a = a;
	this.b = b;
    }
}