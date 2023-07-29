package lesson12;

public class Main {
    public static void main(String[] args) {
        Subject grades = new Subject(50, 0, 67, 59);
        Student student = new Student("123", "Иван Раиля", grades);
        Teacher teacher = new Teacher("Адейло Чучкова");

        teacher.checkGrades(student);
    }
}