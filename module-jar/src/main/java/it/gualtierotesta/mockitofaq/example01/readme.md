EXAMPLE 01
==========

The example shows the basic example of a Mockito based unit test.

Mockito is used **without** annotations.

`TheClass` is the class we want to test (our *sut*, systme under test).

`ADependency` is a TheClass dependency we need to *cut* by a mock to test TheClass under
all conditions (all use cases).

The dependency is injected in the TheClass by its constructor.

Assertions are done by the HamCrest library which is a jUnit dependency.