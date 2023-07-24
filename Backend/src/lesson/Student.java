package lesson;

public class Student extends Human {
    private String className;
    private String subgroup;
    private String sector;
    private double averageGrade;

    public Student(String name, String surname, int age, String className, String subgroup, String sector, double averageGrade) {
        super(name, surname, age);
        this.className = className;
        this.subgroup = subgroup;
        this.sector = sector;
        this.averageGrade = averageGrade;
    }

    public String getClassName() {
        return className;
    }

    public String getSubgroup() {
        return subgroup;
    }

    public String getSector() {
        return sector;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return super.toString() + ", Class: " + className + ", Subgroup: " + subgroup + ", Sector: " + sector + ", Average Grade: " + averageGrade;
    }
}