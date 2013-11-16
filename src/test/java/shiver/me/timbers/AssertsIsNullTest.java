package shiver.me.timbers;

import static shiver.me.timbers.Asserts.assertIsNull;
import static shiver.me.timbers.Checks.*;

/**
 * @author Karl Bennett
 */
public class AssertsIsNullTest extends AbstractAssertsTest {

    public static final Object NULL = null;
    public static final Object NOT_NULL = new Object();

    public AssertsIsNullTest() {
        super(NULL, NOT_NULL);
    }


    @Override
    protected boolean doCheck(Object value) {

        return isNull(value);
    }

    @Override
    protected void doAssert(String message, Object value) {

        assertIsNull(message, value);
    }
}
