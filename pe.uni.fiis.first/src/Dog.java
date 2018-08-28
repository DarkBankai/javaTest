public class Dog implements Animal {
    @Override
    public void makeSound() {
        bark();
    }

    void bark(){
        System.out.println("Gua Gua");
    }
}
