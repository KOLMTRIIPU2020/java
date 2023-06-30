public class Animal {

        private String name;
        private int age;
        private String color;
        private String country;

        public void setAnimal(String name, int age, String color, String country) {
            this.name = name;
            this.age = age;
            this.color = color;
            this.country = country;
        }
        public String getAnimal() {
            return "Name: " + name + ", Age: " + age + ", Color: " + color + ", Country: " + country;
        }
    }
