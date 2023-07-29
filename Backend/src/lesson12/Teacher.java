package lesson12;

public class Teacher {
    private String fullName;

    public Teacher(String fullName) {
        this.fullName = fullName;
    }

    public void checkGrades(Student student) {
        Subject grades = student.getGrades();

        if (grades.getMath() < 60) {
            System.out.println("Срез по математике у студента " + student.getFullName());
        }
        if (grades.getHistory() < 60) {
            System.out.println("Срез по истории у студента " + student.getFullName());
        }
        if (grades.getScience() < 60) {
            System.out.println("Срез по наукам у студента " + student.getFullName());
        }
        if (grades.getChemistry() < 60) {
            System.out.println("Срез по химии у студента " + student.getFullName());
        }
    }
}
