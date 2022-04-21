package koschei.models;

import org.springframework.stereotype.Component;

public class Egg6 {

    private Needle7 needle;

    public Egg6 (Needle7 neddle) {
        this.needle = neddle;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString();
    }
}
