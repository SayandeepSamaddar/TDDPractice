import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReverseLastTwoCharsTest {

    @Test
    public void testReverseLastTwoChars() {
        assertEquals("abecd", StringUtils.reverseLastTwoChars("abedc"));
        assertEquals("Hello, world!", StringUtils.reverseLastTwoChars("Hello, worl!d"));
        // Add more test cases here
    }
}
