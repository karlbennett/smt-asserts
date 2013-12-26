package shiver.me.timbers.asserts;

import static shiver.me.timbers.checks.Checks.isNotNull;
import static shiver.me.timbers.checks.Checks.isNull;

/**
 * This utility class contains helpful and common assertions.
 *
 * @author Karl Bennett
 */
public final class Asserts {

    private Asserts() {
    }

    /**
     * Assert that the supplied boolean is {@code true}.
     *
     * @param message     the message that will be contained in the error if the assertion fails.
     * @param conditional the {@code boolean} value to check.
     * @throws AssertionError if the supplied {@code conditional} is {@code false}.
     */
    public static void assertIsTrue(String message, boolean conditional) {

        if (!conditional) throw new AssertionError(message);
    }

    /**
     * Assert that the supplied object is {@code null}.
     *
     * @param message the message that will be contained in the error if the assertion fails.
     * @param object  the object to check.
     * @throws AssertionError if the supplied object not {@code null}.
     */
    public static void assertIsNull(String message, Object object) {

        assertIsTrue(message, isNull(object));
    }

    /**
     * Assert that the supplied object is not {@code null}.
     *
     * @param message the message that will be contained in the error if the assertion fails.
     * @param object  the object to check.
     * @throws AssertionError if the supplied object {@code null}.
     */
    public static void assertIsNotNull(String message, Object object) {

        assertIsTrue(message, isNotNull(object));
    }

    /**
     * Return a consistently structured message that can be used for a failed calls to
     * {@link #assertIsNotNull(String, Object)} for method or constructor arguments.
     *
     * @param argumentName the name of the {@code null} argument.
     * @return the message e.g. "MyClass myArg argument cannot be null."
     */
    public static String argumentIsNullMessage(String argumentName) {

        return argumentName + " argument cannot be null.";
    }
}
