package lesson11;


public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 5, "USA");
        Cat cat = new Cat("Whiskers", 3, "England");

        Doc doc = new Doc();
        doc.treatAnimal(dog);
        doc.treatAnimal(cat);

        dog.eat();
        dog.sound();
        dog.sleep();

        cat.eat();
        cat.sound();
        cat.sleep();
    }
}

