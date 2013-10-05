package shiver.me.timbers;

import static shiver.me.timbers.Asserts.assertIsNotBlank;
import static shiver.me.timbers.Asserts.isNotBlank;
import static shiver.me.timbers.AssertsIsBlankWithStringTest.BLANK_STRING;
import static shiver.me.timbers.AssertsIsBlankWithStringTest.NOT_BLANK_STRING;

/**
 * @author Karl Bennett
 */
public class AssertsIsNotBlankWithStringTest extends AbstractAssertsTest {

    public AssertsIsNotBlankWithStringTest() {
        super(NOT_BLANK_STRING, BLANK_STRING);
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
