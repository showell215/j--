package junit;

import junit.framework.TestCase;
import pass.DoubleLiteral;

public class DoubleLiteralTest extends TestCase {

    private DoubleLiteral dl;

    protected void setUp() throws Exception {
        super.setUp();
        dl = new DoubleLiteral();
    }

    public void testDoubleLiteral() {
        dl.doubleLiteral();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
