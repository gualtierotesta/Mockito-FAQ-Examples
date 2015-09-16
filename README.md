MOCKITO FAQ
===========

*by Gualtiero Testa and contributors. Last update on 2015-09-16*

#### Table of Contents
1. [Resources](#id-resources)
2. [General](#id-general)
3. [Installation](#id-installation)
4. [Creating mocks](#id-mocks)
5. [Stubbing methods](#id-methods)
6. [Spying - partial mocks](#id-spy)
7. [Syntax](#id-syntax)
8. [PowerMock](#id-powermock)

<div id="id-resources"></div>
## 1. Resources
1.1  [Mockito Home](http://mockito.org/ "Mockito.org")



<div id="id-general"></div>
## 2. General

*2.1 Why mocking ?*

Unit tests requires the code under test (the unit) to be isolated from the rest of the application.
Tested code dependencies should be "broken" in order to achieve the required isolation.
Using dummy or mocked classes instead of the real classes is a common solution to achieve this isolation.
Creating mocks by hand is a time-consuming activity.
Mocking libraries exist to easy the job to create mocked version of the application classes. 

*2.2 Why Mockito ?*

Mockito is the most popular mocking library. So why not?

*2.3 How to enable Mockito annotations ?*

Mockito annotations like `@Mock` are enabled in two different ways, with and without a test runner.

First way is using the Mockito test runner, annotating the test class with the
 `@RunWith(MockitoJUnitRunner.class)` annotation (valid for jUnit only).
See **Example 02** for a complete example

As alternative, anntations can be enabled as following:

```java
    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);
    }
```
See **Example 03** for a complete example.

Using the runner is the suggested way if no other runners (like, for ex. the Spring framework runner) should be used. 
In this case using `MockitoAnnotations.initMocks()` method is a valid solution.


<div id="id-installation"></div>
## 3. Installation

*3.1 Which version should I install ?*

Mockito 2 is currently in beta status. Mockito 1.x is stable. The suggested dependency is *mockito-core*. See [this wiki page](https://github.com/mockito/mockito/wiki/Declaring-mockito-dependency/) for details.
You can find current status on Mockito Home (see Resources section)


*3.2 What is the difference between mockito-core and mockito-all ?*

*Mockito-core* is the main Mockito library. 
*Mockito-all* includes optional dependencies and it is only available on Mockito 1.x.


*3.3 How to install Mockito in a Maven project ?*

Add following dependency in project pom.xml:

```xml
    <dependency>
        <groupId>org.mockito</groupId>
        <artifactId>mockito-core</artifactId>
        <version>xxxx</version>
    </dependency>
```







<div id="id-mocks"></div>
## 4. Creating mocks

*4.1 How to create a mock (without annotations) ?*

A mock can be created using the `Mockito.mock()` method as following:

```java
    AClass inst = new AClass();
    AClass mock = Mockito.mock(AClass.class);
```

Here `AClass` is the class to be mocked. Object `inst` is an real instance of `AClass` while 
`mock` is its mocked instance.

*Note*: in this example, the first line is just for comparison purposes. 

See **example01** for a complete example.


*4.1 How to create a mock (with annotations and runner) ?*

A mock can be created using the `@Mock` annotation as following:

```java
    @Mock AClass mock;
```
Mockito will create the mock before **each** test execution.

Here `AClass` is the class to be mocked. Object `inst` is an real instance of `AClass` while 
`mock` is its mocked instance.

*Note*: in this example, the first line is just for comparison purposes. 

See **example01** for a complete example.


<div id="id-methods"></div>
## 5. Stubbing methods
TBD

<div id="id-spy"></div>
## 6. Spying - partial mocks
TBD


<div id="id-syntax"></div>
## 7. Syntax
TBD


<div id="id-powermock"></div>
## 8. PowerMock

TBD