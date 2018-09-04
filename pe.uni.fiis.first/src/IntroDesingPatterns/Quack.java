package IntroDesingPatterns;

import IntroDesingPatterns.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Im saying quack quack");
    }
}
