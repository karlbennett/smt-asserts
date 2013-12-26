package shiver.me.timbers.checks;

/**
 * This utility class contains helpful and common checks.
 *
 * @author Karl Bennett
 */
public final class Checks {

    private Checks() {
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
}
