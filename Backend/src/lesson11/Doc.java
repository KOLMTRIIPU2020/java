package lesson11;

class Doc {
    public void treatAnimal(Animal animal) {
        int healthLevel = animal.getHealthLevel();
        if (healthLevel < 50) {
            System.out.println("The doctor is treating the animal.");
            animal.setHealthLevel(100);
        } else {
            System.out.println("The animal is healthy.");
        }
    }
}