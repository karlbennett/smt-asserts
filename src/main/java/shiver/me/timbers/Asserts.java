package shiver.me.timbers;

import java.util.Collection;

import static java.lang.reflect.Array.get;
import static java.lang.reflect.Array.getLength;

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
     * Check if the supplied object is empty, that is if it is {@code null} or that it contains no elements if it is a
     * {@code String}, {@code Array}, or {@code Collection}.
     *
     * @param object the object to check.
     * @return {@code true} if the object is empty, otherwise {@code false};
     */
    public static boolean isEmpty(Object object) {

        if (isNull(object)) return true;

        if (object instanceof String) return 0 == object.toString().length();

        if (object.getClass().isArray()) return 0 == getLength(object);

        if (object instanceof Collection) return 0 == ((Collection) object).size();

        return false;
    }

    /**
     * Check if the supplied object is not empty, that is if it is not {@code null} or that it contains some elements if
     * it is a {@code String}, {@code Array}, or {@code Collection}.
     *
     * @param object the object to check.
     * @return {@code true} if the object is not empty, otherwise {@code false};
     */
    public static boolean isNotEmpty(Object object) {

        return !isEmpty(object);
    }

    /**
     * Check if the supplied object is empty, that is if it is {@code null} or that it contains no elements if it is an
     * {@code Array} or {@code Collection}, or that it only contains white space if it is a {@code String}.
     *
     * @param object the object to check.
     * @return {@code true} if the object is blank, otherwise {@code false};
     */
    public static boolean isBlank(Object object) {

        if (isEmpty(object)) return true;

        if (object instanceof String) {

            return 0 == object.toString().trim().length();
        }

        if (object.getClass().isArray()) {

            for (int i = 0; i < getLength(object); i++) {

                if (isNotNull(get(object, i))) return false;
            }

            return true;
        }

        if (object instanceof Collection) {

            for (Object element : ((Collection) object)) {

                if (isNotNull(element)) return false;
            }

            return true;
        }

        return false;
    }

    /**
     * Check if the supplied object is not empty, that is if it is not {@code null} or that it contains some elements if
     * it is an {@code Array} or {@code Collection}, or that it doesn't just contain white space if it is a
     * {@code String}.
     *
     * @param object the object to check.
     * @return {@code true} if the object is not blank, otherwise {@code false};
     */
    public static boolean isNotBlank(Object object) {

        return !isBlank(object);
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
     * Assert that the supplied object {@link #isEmpty(Object)}.
     *
     * @param message the message that will be contained in the error if the assertion fails.
     * @param object  the object to check.
     * @throws AssertionError if the supplied object is not empty.
     */
    public static void assertIsEmpty(String message, Object object) {

        assertIsTrue(message, isEmpty(object));
    }

    /**
     * Assert that the supplied object {@link #isNotEmpty(Object)}.
     *
     * @param message the message that will be contained in the error if the assertion fails.
     * @param object  the object to check.
     * @throws AssertionError if the supplied object is empty.
     */
    public static void assertIsNotEmpty(String message, Object object) {

        assertIsTrue(message, isNotEmpty(object));
    }

    /**
     * Assert that the supplied object {@link #isBlank(Object)}.
     *
     * @param message the message that will be contained in the error if the assertion fails.
     * @param object  the object to check.
     * @throws AssertionError if the supplied object is not blank.
     */
    public static void assertIsBlank(String message, Object object) {

        assertIsTrue(message, isBlank(object));
    }

    /**
     * Assert that the supplied object {@link #isNotBlank(Object)}.
     *
     * @param message the message that will be contained in the error if the assertion fails.
     * @param object  the object to check.
     * @throws AssertionError if the supplied object is blank.
     */
    public static void assertIsNotBlank(String message, Object object) {

        assertIsTrue(message, isNotBlank(object));
    }
}
