package shiver.me.timbers;

import static shiver.me.timbers.Asserts.assertIsNotBlank;
import static shiver.me.timbers.Asserts.isNotBlank;
import static shiver.me.timbers.AssertsIsBlankWithArrayTest.BLANK_ARRAY;
import static shiver.me.timbers.AssertsIsBlankWithArrayTest.NOT_BLANK_ARRAY;

/**
 * @author Karl Bennett
 */
public class AssertsIsNotBlankWithArrayTest extends AbstractAssertsTest {

    public AssertsIsNotBlankWithArrayTest() {
        super(NOT_BLANK_ARRAY, BLANK_ARRAY);
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
