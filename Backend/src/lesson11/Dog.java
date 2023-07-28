package lesson11;

class Dog extends Animal {
    public Dog(String name, int age, String origin) {
        super(name, age, origin);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating bones.");
    }

    @Override
    public void sound() {
        System.out.println("Dog is barking.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping in its doghouse.");
    }
}