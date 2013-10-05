package shiver.me.timbers;

import static shiver.me.timbers.Asserts.assertIsBlank;
import static shiver.me.timbers.Asserts.isBlank;

/**
 * @author Karl Bennett
 */
public class AssertsIsBlankWithArrayTest extends AbstractAssertsTest {

    public static final Object[] BLANK_ARRAY = new Object[3];
    public static final Object[] NOT_BLANK_ARRAY = {new Object(), new Object(), new Object()};

    public AssertsIsBlankWithArrayTest() {
        super(BLANK_ARRAY, NOT_BLANK_ARRAY);
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
