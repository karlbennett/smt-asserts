package shiver.me.timbers;

import org.junit.Test;

import static shiver.me.timbers.Asserts.assertIsTrue;

/**
 * @author Karl Bennett
 */
public class AssertsTrueTest {

    @Test
    public void testAssertTrueWithTrue() {

        assertIsTrue("should be true", true);
    }

    @Test(expected = AssertionError.class)
    public void testAssertTrueWithFalse() {

        assertIsTrue("should be true", false);
    }
}
