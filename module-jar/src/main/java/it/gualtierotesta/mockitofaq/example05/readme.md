EXAMPLE 05
==========

The example shows how to test a non-abstract method in an **abstract** class, even without a concrete implementation class.

`TheClass` is the class we want to test (our *sut*, system under test). It is an abstract class
so we cannot simply instantiate it but we can create a spy (a special mock where the non abstract methods code is kept).

Method `loggedUsersMessage()` is the method we want to test; it calls the abstract method `servicename()` 
that can be stubbed by `Mockito.when()`.

`ADependency` is an interface and a TheClass dependency we need to *cut* by a mock to test TheClass.

The dependency is injected in the TheClass by the setter using the `@InjectMocks` annotation.

Assertions are done by the HamCrest library which is a jUnit dependency.