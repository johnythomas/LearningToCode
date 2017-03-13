package johny.learningtocode.hackerearth.arrays.oned;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarkTheAnswerTest {

    @Test
    public void testMarkTheAnswer() {
        String[] questions = "4 3 7 6 7 2 2".split("\\s");
        assertEquals(3, MarkTheAnswer.findScore(questions, 6));

        questions = "1 2 3 4 5 6 7 8 9 10".split("\\s");
        assertEquals(6, MarkTheAnswer.findScore(questions, 6));

        questions = "1 2 3 4 5 6 1 2 3 4 5".split("\\s");
        assertEquals(10, MarkTheAnswer.findScore(questions, 5));

        questions = "11 10".split("\\s");
        assertEquals(0, MarkTheAnswer.findScore(questions, 6));
    }
}