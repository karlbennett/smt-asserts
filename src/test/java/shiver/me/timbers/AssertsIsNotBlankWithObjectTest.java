package shiver.me.timbers;

import static shiver.me.timbers.Asserts.assertIsNotBlank;
import static shiver.me.timbers.Asserts.isNotBlank;
import static shiver.me.timbers.AssertsIsNullTest.NOT_NULL;
import static shiver.me.timbers.AssertsIsNullTest.NULL;

/**
 * @author Karl Bennett
 */
public class AssertsIsNotBlankWithObjectTest extends AbstractAssertsTest {

    public AssertsIsNotBlankWithObjectTest() {
        super(NOT_NULL, NULL);
    }

    @Override
    protected boolean doCheck(Object value) {

        return isNotBlank(value);
    }

    @Override
    protected void doAssert(String message, Object value) {

        assertIsNotBlank(message, value);
    }
}
