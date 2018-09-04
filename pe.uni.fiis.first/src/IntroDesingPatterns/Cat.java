package IntroDesingPatterns;

import IntroDesingPatterns.Animal;

public class Cat implements Animal {
    @Override
    public void makeSound() {
        meow();
    }
    void meow(){
        System.out.println("Miau Miau");
    }
}
