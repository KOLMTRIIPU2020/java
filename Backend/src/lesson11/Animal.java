package lesson11;

class Animal {
    private String name;
    private int age;
    private String origin;
    private int healthLevel;

    public Animal(String name, int age, String origin) {
        this.name = name;
        this.age = age;
        this.origin = origin;
        this.healthLevel = 100;
    }

    public void eat() {
        System.out.println("Animal is eating.");
    }

    public void sound() {
        System.out.println("Animal is making a sound.");
    }

    public void sleep() {
        System.out.println("Animal is sleeping.");
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }
}