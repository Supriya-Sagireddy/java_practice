package polymorphism.AnimalPoly;

public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        System.out.println("Generic Animal:");
        genericAnimal.speak();

        System.out.println("Dog:");
        dog.speak();

        System.out.println("Cat:");
        cat.speak();

        System.out.println("Cow:");
        cow.speak();
    }
}

