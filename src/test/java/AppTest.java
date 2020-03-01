import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testNumber() {
        App app = new App();
        app.setNumber(4);
        assertEquals(5, app.getNumber());
    }

}