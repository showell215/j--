package junit;

import junit.framework.TestCase;
import pass.BitwiseComplement;

public class BitwiseComplementTest extends TestCase {

    private BitwiseComplement bc;

    protected void setUp() throws Exception {
        super.setUp();
        bc = new BitwiseComplement();
    }

    public void testDivide() {
        this.assertEquals(bc.bitwiseComplement(4), -5);
        this.assertEquals(bc.bitwiseComplement(-5), 4);
        this.assertEquals(bc.bitwiseComplement(41), -42);
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

}
