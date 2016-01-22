package junit;

import junit.framework.TestCase;
import pass.Modulo;

public class ModuloTest extends TestCase {

    private Modulo modulo;

    protected void setUp() throws Exception {
        super.setUp();
        modulo = new Modulo();
    }

    public void testDivide() {
        this.assertEquals(modulo.mod(0, 42), 42);
        this.assertEquals(modulo.mod(42, 6), 0);
        this.assertEquals(modulo.mod(42, 5), 2);
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

}
