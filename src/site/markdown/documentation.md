#### isNull(Object):boolean
This method is used for checking if the supplied value is `null`, if it is the method will return `true`. It is by it's
very nature `null` safe.

#### isNotNull(Object):boolean
This method produces the exact opposite behaviour of `isNull(Object)`.

#### assertIsTrue(String,boolean):throws AssertionError
Assert that the supplied `boolean` is `true`, if it isn't it will throw an
[`AssertionError`](http://docs.oracle.com/javase/7/docs/api/java/lang/AssertionError.html) that contains the supplied
message.

#### assertIsNull(String,Object):throws AssertionError
Assert that the supplied object is `null`, if it isn't it will throw an `AssertionError` that contains the supplied
message.

#### assertIsNotNull(String,Object):throws AssertionError
This method produces the exact opposite behaviour of `assertIsNotNull(String,Object)`.