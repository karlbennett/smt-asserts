package shiver.me.timbers;

import static shiver.me.timbers.Asserts.assertIsNotBlank;
import static shiver.me.timbers.Asserts.isNotBlank;
import static shiver.me.timbers.AssertsIsBlankWithCollectionTest.BLANK_COLLECTION;
import static shiver.me.timbers.AssertsIsBlankWithCollectionTest.NOT_BLANK_COLLECTION;

/**
 * @author Karl Bennett
 */
public class AssertsIsNotBlankWithCollectionTest extends AbstractAssertsTest {

    public AssertsIsNotBlankWithCollectionTest() {
        super(NOT_BLANK_COLLECTION, BLANK_COLLECTION);
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
