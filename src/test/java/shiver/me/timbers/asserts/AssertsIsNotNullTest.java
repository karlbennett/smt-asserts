package shiver.me.timbers.asserts;

import static shiver.me.timbers.asserts.Asserts.assertIsNotNull;
import static shiver.me.timbers.checks.Checks.isNotNull;

/**
 * @author Karl Bennett
 */
public class AssertsIsNotNullTest extends AbstractAssertsTest {

    public AssertsIsNotNullTest() {
        super(AssertsIsNullTest.NOT_NULL, AssertsIsNullTest.NULL);
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
