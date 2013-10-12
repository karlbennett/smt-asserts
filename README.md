smt-asserts
===========

A Java library that contains useful utility methods to help with common assertions.

#### isNull(Object):boolean/isNotNull(Object):boolean

Methods for checking for `null`.
```java
isNull(null); // true
isNull(new Object()); // false
    
isNotNull(null); // false
isNotNull(new Object()); // true
```
#### Assertions

All the assertions behave in the same way as their equivalent methods except that instead of returning `false` when they fail they throw an `AssertionError`.
