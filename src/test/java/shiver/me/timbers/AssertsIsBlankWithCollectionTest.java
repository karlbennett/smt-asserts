package shiver.me.timbers;

import java.util.Collection;

import static java.util.Arrays.asList;
import static shiver.me.timbers.Asserts.assertIsBlank;
import static shiver.me.timbers.Asserts.isBlank;

/**
 * @author Karl Bennett
 */
public class AssertsIsBlankWithCollectionTest extends AbstractAssertsTest {

    public static final Collection<Object> BLANK_COLLECTION = asList(null, null, null);
    public static final Collection<Object> NOT_BLANK_COLLECTION = asList(new Object(), new Object(), new Object());

    public AssertsIsBlankWithCollectionTest() {
        super(BLANK_COLLECTION, NOT_BLANK_COLLECTION);
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
