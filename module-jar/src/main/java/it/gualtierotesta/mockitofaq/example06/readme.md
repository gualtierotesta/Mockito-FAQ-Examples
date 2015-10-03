# EXAMPLE 06

The example shows how to:

1. verify that a mock method has been invoked *once* with a **generic** parameter (see test1)

2. verify that a mock method has been invoked *once* with a **specific** parameter (see test2)

3. capture the parameter used to invoke a mock method to be compared with expected values.

`TheClass` is the class we want to test (our *sut*, systme under test).

`ADependency` is a TheClass dependency we need to *cut* by a mock to test TheClass under
all conditions (all use cases).

The dependency is injected in the TheClass by its constructor.

Assertions are done by the HamCrest library which is a jUnit dependency.

## Test 1

The `Mockito.verify()` will **not fail** if the `saveUser()`  has been invoked only one time

Any User instance is ok as argument.

## Test 2

The `Mockito.verify()` will **not fail** if the `saveUser()`  has been invoked only one time
with an User instance which is equal to the expected instance.

We want to be sure that `saveUser()` is invoked with a correct User instance as parameter 
by comparing it with an expected User instance.

**IMPORTANT**: Comparison is performed using the `User.equals()` method.


## Test 3

The `Mockito.verify()` will **not** fail if the `saveUser()`  has been invoked only one time
with an User instance which has the expected contents.

We want to be sure that `saveUser()` is invoked with a correct User instance as parameter
by comparing User instance **contents** with expected values.

**IMPORTANT**: Comparison is performed using the User getters.

