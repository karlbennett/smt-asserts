package shiver.me.timbers;

import static shiver.me.timbers.Asserts.assertIsNotEmpty;
import static shiver.me.timbers.Asserts.isNotEmpty;
import static shiver.me.timbers.AssertsIsEmptyWithCollectionTest.EMPTY_COLLECTION;
import static shiver.me.timbers.AssertsIsEmptyWithCollectionTest.NOT_EMPTY_COLLECTION;

/**
 * @author Karl Bennett
 */
public class AssertsIsNotEmptyWithCollectionTest extends AbstractAssertsTest {

    public AssertsIsNotEmptyWithCollectionTest() {
        super(NOT_EMPTY_COLLECTION, EMPTY_COLLECTION);
    }

    @Override
    protected boolean doCheck(Object value) {

        return isNotEmpty(value);
    }

    @Override
    protected void doAssert(String message, Object value) {

        assertIsNotEmpty(message, value);
    }
}
