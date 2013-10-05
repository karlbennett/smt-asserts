package shiver.me.timbers;

import static shiver.me.timbers.Asserts.assertIsNotEmpty;
import static shiver.me.timbers.Asserts.isNotEmpty;
import static shiver.me.timbers.AssertsIsEmptyWithStringTest.EMPTY_STRING;
import static shiver.me.timbers.AssertsIsEmptyWithStringTest.NOT_EMPTY_STRING;

/**
 * @author Karl Bennett
 */
public class AssertsIsNotEmptyWithStringTest extends AbstractAssertsTest {

    public AssertsIsNotEmptyWithStringTest() {
        super(NOT_EMPTY_STRING, EMPTY_STRING);
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
