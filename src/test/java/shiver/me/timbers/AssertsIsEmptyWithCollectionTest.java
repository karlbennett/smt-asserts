package shiver.me.timbers;

import java.util.Collection;
import java.util.HashSet;

import static java.util.Arrays.asList;
import static shiver.me.timbers.Asserts.assertIsEmpty;
import static shiver.me.timbers.Asserts.isEmpty;

/**
 * @author Karl Bennett
 */
public class AssertsIsEmptyWithCollectionTest extends AbstractAssertsTest {

    public static final Collection<Object> EMPTY_COLLECTION = new HashSet<Object>();
    public static final Collection<Object> NOT_EMPTY_COLLECTION = asList(null, null, null);

    public AssertsIsEmptyWithCollectionTest() {
        super(EMPTY_COLLECTION, NOT_EMPTY_COLLECTION);
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
