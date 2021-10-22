package pl.wiktordziaodsz.letters;

import java.util.function.Predicate;

public class CharCounter {
    public int count(char a, String inputString) {
        return (int) inputString.toLowerCase().chars()
                .mapToObj( c->(char) c)
                .filter(new Predicate<Object>() {
                    public boolean test(Object c) {
                        return c.equals(a);
                    }
                })
                .count();
        //return 4;
    }
}
