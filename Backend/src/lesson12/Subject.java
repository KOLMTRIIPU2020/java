package lesson12;


public class Subject {
    private int math;
    private int history;
    private int science;
    private int chemistry;

    public Subject(int math, int history, int science, int chemistry) {
        this.math = math;
        this.history = history;
        this.science = science;
        this.chemistry = chemistry;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }
}
