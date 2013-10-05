package shiver.me.timbers;

import static shiver.me.timbers.Asserts.assertIsEmpty;
import static shiver.me.timbers.Asserts.isEmpty;

/**
 * @author Karl Bennett
 */
public class AssertsIsEmptyWithArrayTest extends AbstractAssertsTest {

    public static final Object[] EMPTY_ARRAY = new Object[0];
    public static final Object[] NOT_EMPTY_ARRAY = new Object[3];

    public AssertsIsEmptyWithArrayTest() {
        super(EMPTY_ARRAY, NOT_EMPTY_ARRAY);
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
