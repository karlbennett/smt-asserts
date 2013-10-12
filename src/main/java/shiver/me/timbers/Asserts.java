package shiver.me.timbers;

/**
 * This utility class contains helpful and common assertions.
 *
 * @author Karl Bennett
 */
public final class Asserts {

    private Asserts() {
    }

    /**
     * Check if the supplied object is {@code null}.
     *
     * @param object the object to check.
     * @return {@code true} if the object is {@code null}, otherwise {@code false};
     */
    public static boolean isNull(Object object) {

        return null == object;
    }

    /**
     * Check if the supplied object is not {@code null}.
     *
     * @param object the object to check.
     * @return {@code true} if the object is not {@code null}, otherwise {@code false};
     */
    public static boolean isNotNull(Object object) {

        return !isNull(object);
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
}
