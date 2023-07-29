package lesson12;

public class Student {
    private String id;
    private String fullName;
    private Subject grades;

    public Student(String id, String fullName, Subject grades) {
        this.id = id;
        this.fullName = fullName;
        this.grades = grades;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Subject getGrades() {
        return grades;
    }

    public void setGrades(Subject grades) {
        this.grades = grades;
    }
}