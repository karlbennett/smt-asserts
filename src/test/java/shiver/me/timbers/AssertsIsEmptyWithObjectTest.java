package shiver.me.timbers;

import static shiver.me.timbers.Asserts.assertIsEmpty;
import static shiver.me.timbers.Asserts.isEmpty;
import static shiver.me.timbers.AssertsIsNullTest.*;

/**
 * @author Karl Bennett
 */
public class AssertsIsEmptyWithObjectTest extends AbstractAssertsTest {

    public AssertsIsEmptyWithObjectTest() {
        super(NULL, NOT_NULL);
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
