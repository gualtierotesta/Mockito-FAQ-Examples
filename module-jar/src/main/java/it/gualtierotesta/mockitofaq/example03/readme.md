EXAMPLE 03
==========

The example shows the basic example of a Mockito based unit test.

Mockito is used *with* annotations but *without* the Mockito runner.

The `@Before` method invokes `MockitoAnnotations.initMocks()` to enable the annotations

`TheClass` is the class we want to test (our *sut*, system under test).

`ADependency` is a TheClass dependency we need to *cut* by a mock to test TheClass under
all conditions (all use cases).

The dependency is injected in the TheClass by its constructor using the `@InjectMocks` annotation.

Assertions are done by the HamCrest library which is a jUnit dependency.