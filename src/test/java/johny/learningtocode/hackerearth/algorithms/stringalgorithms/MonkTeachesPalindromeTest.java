package johny.learningtocode.hackerearth.algorithms.stringalgorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MonkTeachesPalindromeTest {

    @Test
    public void testMonkTeachesPalindrome() {
        assertEquals("NO", MonkTeachesPalindrome.isEvenPalindrome("abc"));
        assertEquals("YES EVEN", MonkTeachesPalindrome.isEvenPalindrome("abba"));
        assertEquals("YES EVEN", MonkTeachesPalindrome.isEvenPalindrome("ABCCBA"));
        assertEquals("YES ODD", MonkTeachesPalindrome.isEvenPalindrome("ABCBA"));
        assertEquals("NO", MonkTeachesPalindrome.isEvenPalindrome("AB"));
    }
}
