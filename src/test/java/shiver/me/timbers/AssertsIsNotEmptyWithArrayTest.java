package shiver.me.timbers;

import static shiver.me.timbers.Asserts.assertIsNotEmpty;
import static shiver.me.timbers.Asserts.isNotEmpty;
import static shiver.me.timbers.AssertsIsEmptyWithArrayTest.EMPTY_ARRAY;
import static shiver.me.timbers.AssertsIsEmptyWithArrayTest.NOT_EMPTY_ARRAY;

/**
 * @author Karl Bennett
 */
public class AssertsIsNotEmptyWithArrayTest extends AbstractAssertsTest {

    public AssertsIsNotEmptyWithArrayTest() {
        super(NOT_EMPTY_ARRAY, EMPTY_ARRAY);
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
