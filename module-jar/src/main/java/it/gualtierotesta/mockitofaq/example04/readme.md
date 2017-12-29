EXAMPLE 04
==========

The example shows how to create a mock of an **interface**, even without an implementation class.

`TheClass` is the class we want to test (our *sut*, system under test).

`ADependency` is an interface and a TheClass dependency we need to *cut* by a mock to test TheClass.

The dependency is injected in the TheClass by its constructor using the `@InjectMocks` annotation.

Assertions are done by the HamCrest library which is a jUnit dependency.