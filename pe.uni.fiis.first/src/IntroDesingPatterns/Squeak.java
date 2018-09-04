package IntroDesingPatterns;

import IntroDesingPatterns.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("im squeaking");
    }
}
