package junit;

import junit.framework.TestCase;
import pass.Modulo;

public class ModuloTest extends TestCase {

    private Modulo mod;

    protected void setUp() throws Exception {
        super.setUp();
        mod = new Modulo();
    }

    public void testModulo() {
        this.assertEquals(mod.modulo(41, 42), 41);
        this.assertEquals(mod.modulo(42, 6), 0);
        this.assertEquals(mod.modulo(42, 5), 2);
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

}
