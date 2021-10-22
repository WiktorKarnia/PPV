package pl.wiktordziaodsz.letters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CharCounterTest {
    @Test
    public void ItCountsCharInString() {
        String inputString = "Ala ma kota";
        CharCounter charCounter = new CharCounter();
        int charCount = charCounter.count('a',inputString);
        Assertions.assertEquals(4,charCount);
    }

}
