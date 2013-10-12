smt-asserts is a very small library that provides some simple, but commonly needed checks and assets.

Currently the library only contains `null` checks and asserts.

### Usage:

<pre class="source">
<span class="methodName">isNull</span><span class="parentheses">(</span>null<span class="parentheses">)</span>; <span class="comment">// true</span>
<span class="methodName">isNull</span><span class="parentheses">(</span>new Object<span class="parentheses">())</span>; <span class="comment">// false</span>

<span class="methodName">isNotNull</span><span class="parentheses">(</span>null<span class="parentheses">)</span>; <span class="comment">// false</span>
<span class="methodName">isNotNull</span><span class="parentheses">(</span>new Object<span class="parentheses">())</span>; <span class="comment">// true</span>

<span class="methodName">assertIsNull</span><span class="parentheses">(</span><span class="string">"this should be null."</span>, new Object<span class="parentheses">())</span>; <span class="comment">// Throws Assertions Error with string as message.</span>
<span class="methodName">assertIsNotNull</span><span class="parentheses">(</span><span class="string">"this should not be null."</span>, null<span class="parentheses">)</span>; <span class="comment">// Throws Assertions Error with string as message.</span>
</pre>