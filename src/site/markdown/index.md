smt-asserts is a very small library that provides some simple, but commonly needed checks and assets.

Currently the library only contains `null` checks and asserts.

### Usage:

<pre class="source">
isNull(null); // true
isNull(new Object()); // false

isNotNull(null); // false
isNotNull(new Object()); // true

assertIsNull("this should be null.", new Object()); // Throws Assertions Error with string as message.
assertIsNotNull("this should not be null.", null); // Throws Assertions Error with string as message.
</pre>