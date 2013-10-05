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
#### isEmpty(Object):boolean/isNotEmpty(Object):boolean

Methods for checking for emptyness, that is the lack of any values.
```java
isEmpty(new Object[0]); // true
isEmpty(new Object[3]); // false
isEmpty(new HashSet()); // true
isEmpty(Arrays.asList(null, null, null)); // false
isEmpty(""); // true
isEmpty("   "); // false
    
isNotEmpty(new Object[0]); // false
isNotEmpty(new Object[3]); // true
isNotEmpty(new HashSet()); // false
isNotEmpty(Arrays.asList(null, null, null)); // true
isNotEmpty(""); // false
isNotEmpty("   "); // true
```    
#### isBlank(Object):boolean/isNotBlank(Object):boolean

Methods for checking if something is blank, that is it contains meaningless values.
```java
isBlank(new Object[3]); // true
isBlank(new Object[]{new Object(), new Object(), new Object()}); // false
isBlank(Arrays.asList(null, null, null)); // true
isBlank(Arrays.asList(new Object(), new Object(), new Object())); // false
isBlank("   "); // true
isBlank("not blank"); // false
    
isNotBlank(new Object[3]); // false
isNotBlank(new Object[]{new Object(), new Object(), new Object()}); // true
isNotBlank(Arrays.asList(null, null, null)); // false
isNotBlank(Arrays.asList(new Object(), new Object(), new Object())); // true
isNotBlank("   "); // false
isNotBlank("not blank"); // true
```
#### Assertions

All the assertions behave in the same way as their equivalent methods except that instead of returning `false` when they fail they throw an `AssertionError`.
