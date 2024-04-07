public class Main {
    public static void main(String[] args) {
        Animal exampleDog = new Dog(); // Polymorphism Example: A class can have many forms
        Animal exampleCat = new Cat();

        exampleDog.Sound();
        exampleCat.Sound();
    }
}
