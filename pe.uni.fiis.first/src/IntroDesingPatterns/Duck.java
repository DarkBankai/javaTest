package IntroDesingPatterns;

public class Duck {

    Integer peso;
    Integer edad;

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
/*
    void quack(){
        System.out.println("Im saying cuak cuak");
    }
 */

    void performQuack(){
        quackBehavior.quack();
    };
    void performFly(){
        flyBehavior.fly();
    };

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior=fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior=qb;
    }


    void swim(){
        System.out.println("I can swim ");
    }
    void display(){
        System.out.println("Im  a duck");
    }

}
