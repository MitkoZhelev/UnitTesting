package Testing;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Test2 {
    @Test
    public void TestSimpleString () {
     //   TestThis test = new TestThis();
        assert (TestThis.simpleString().length() > 0);
        assertEquals(TestThis.compareToString(),0);
    }

}
