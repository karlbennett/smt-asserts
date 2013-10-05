package shiver.me.timbers;

import static shiver.me.timbers.Asserts.assertIsEmpty;
import static shiver.me.timbers.Asserts.isEmpty;

/**
 * @author Karl Bennett
 */
public class AssertsIsEmptyWithStringTest extends AbstractAssertsTest {

    public static final String EMPTY_STRING = "";
    public static final String NOT_EMPTY_STRING = "this string is not empty";

    public AssertsIsEmptyWithStringTest() {
        super(EMPTY_STRING, NOT_EMPTY_STRING);
    }

    @Override
    protected boolean doCheck(Object value) {

        return isEmpty(value);
    }

    @Override
    protected void doAssert(String message, Object value) {

        assertIsEmpty(message, value);
    }
}
