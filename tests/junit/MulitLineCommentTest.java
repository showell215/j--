package junit;

import junit.framework.TestCase;
import pass.MultiLineComment;

public class MultiLineCommentTest extends TestCase {

    private MultiLineComment mlc;

    protected void setUp() throws Exception {
        super.setUp();
        mlc = new MultiLineComment();
    }

    public void testMultiLineComment() {
        this.assertTrue(mlc.multiLineComment(42);
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

}
