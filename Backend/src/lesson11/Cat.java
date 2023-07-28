package lesson11;

class Cat extends Animal {
    public Cat(String name, int age, String origin) {
        super(name, age, origin);
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating fish.");
    }

    @Override
    public void sound() {
        System.out.println("Cat is meowing.");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping on the windowsill.");
    }
}
