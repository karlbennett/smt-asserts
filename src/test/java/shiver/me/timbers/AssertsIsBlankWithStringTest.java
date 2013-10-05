package shiver.me.timbers;

import static shiver.me.timbers.Asserts.assertIsBlank;
import static shiver.me.timbers.Asserts.isBlank;

/**
 * @author Karl Bennett
 */
public class AssertsIsBlankWithStringTest extends AbstractAssertsTest {

    public static final String BLANK_STRING = "   ";
    public static final String NOT_BLANK_STRING = "this string is not blank";

    public AssertsIsBlankWithStringTest() {
        super(BLANK_STRING, NOT_BLANK_STRING);
    }

    @Override
    protected boolean doCheck(Object value) {

        return isBlank(value);
    }

    @Override
    protected void doAssert(String message, Object value) {

        assertIsBlank(message, value);
    }
}
