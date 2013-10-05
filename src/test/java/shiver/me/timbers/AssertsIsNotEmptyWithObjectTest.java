package shiver.me.timbers;

import static shiver.me.timbers.Asserts.assertIsEmpty;
import static shiver.me.timbers.Asserts.assertIsNotEmpty;
import static shiver.me.timbers.Asserts.isEmpty;
import static shiver.me.timbers.Asserts.isNotEmpty;
import static shiver.me.timbers.AssertsIsNullTest.NOT_NULL;
import static shiver.me.timbers.AssertsIsNullTest.NULL;

/**
 * @author Karl Bennett
 */
public class AssertsIsNotEmptyWithObjectTest extends AbstractAssertsTest {

    public AssertsIsNotEmptyWithObjectTest() {
        super(NOT_NULL, NULL);
    }

    @Override
    protected boolean doCheck(Object value) {

        return isNotEmpty(value);
    }

    @Override
    protected void doAssert(String message, Object value) {

        assertIsNotEmpty(message, value);
    }
}
