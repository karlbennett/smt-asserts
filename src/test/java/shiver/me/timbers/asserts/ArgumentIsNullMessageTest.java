package shiver.me.timbers.asserts;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static shiver.me.timbers.asserts.Asserts.argumentIsNullMessage;

public class ArgumentIsNullMessageTest {

    @Test
    public void testArgumentIsNullMessageWithString() {

        assertEquals("message should be correct for string.", "test argument cannot be null.",
                argumentIsNullMessage("test"));
    }

    @Test
    public void testArgumentIsNullMessageWithEmptyString() {

        assertEquals("message should be correct for empty string.", " argument cannot be null.",
                argumentIsNullMessage(""));
    }

    @Test
    public void testArgumentIsNullMessageWithNull() {

        assertEquals("message should be correct for null string.", "null argument cannot be null.",
                argumentIsNullMessage(null));
    }
}
