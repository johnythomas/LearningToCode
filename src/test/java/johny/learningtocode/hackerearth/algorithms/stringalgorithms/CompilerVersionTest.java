package johny.learningtocode.hackerearth.algorithms.stringalgorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompilerVersionTest {

    @Test
    public void testCompilerVersion() {
        assertEquals("int t; // variable t", CompilerVersion.convertLineToNewCode("int t; // variable t").toString());
        assertEquals("t.a=0;  //t->a does something", CompilerVersion.convertLineToNewCode("t->a=0;  //t->a does something").toString());
        assertEquals("return 0;", CompilerVersion.convertLineToNewCode("return 0;").toString());
    }
}
