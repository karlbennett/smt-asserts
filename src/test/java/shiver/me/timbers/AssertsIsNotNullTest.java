package shiver.me.timbers;

import static shiver.me.timbers.Asserts.assertIsNotNull;
import static shiver.me.timbers.AssertsIsNullTest.NOT_NULL;
import static shiver.me.timbers.AssertsIsNullTest.NULL;
import static shiver.me.timbers.Checks.isNotNull;

/**
 * @author Karl Bennett
 */
public class AssertsIsNotNullTest extends AbstractAssertsTest {

    public AssertsIsNotNullTest() {
        super(NOT_NULL, NULL);
    }

    @Override
    protected boolean doCheck(Object value) {

        return isNotNull(value);
    }

    @Override
    protected void doAssert(String message, Object value) {

        assertIsNotNull(message, value);
    }
}
