import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author ForteScarlet
 */
public class JustTest {

    @Test
    public void run() {
        int result = Util.foo(value -> 2);
        Assertions.assertEquals(result, 3);
    }

}
