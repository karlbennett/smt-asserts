package shiver.me.timbers;

import static shiver.me.timbers.Asserts.assertIsBlank;
import static shiver.me.timbers.Asserts.isBlank;
import static shiver.me.timbers.AssertsIsNullTest.*;

/**
 * @author Karl Bennett
 */
public class AssertsIsBlankWithObjectTest extends AbstractAssertsTest {

    public AssertsIsBlankWithObjectTest() {
        super(NULL, NOT_NULL);
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
