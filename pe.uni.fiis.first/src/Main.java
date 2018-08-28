public class Main {

    public static void main(String[] args) {
        Duck duck1 = new Duck();

        //duck1.quack();
        Duck mallarDuck1 = new MallardDuck();
       // mallarDuck1.quack();
        mallarDuck1.display();
        // mallarDuck1.display2("hola"); al ser creado referenciando a duck ya no puede tener display2() se arregla convitiendo

        MallardDuck mallarDuck2 = new MallardDuck();
        mallarDuck2.display();
        mallarDuck2.display2("Hola 2");



        //haciendo con animal un parentesis

        Animal animal = new Dog();
        animal.makeSound();
        Animal animal1 = new Cat();
        animal1.makeSound();


        //probando el nuevo patron
        mallarDuck2.performQuack();

        mallarDuck2.performFly();




    }
}
