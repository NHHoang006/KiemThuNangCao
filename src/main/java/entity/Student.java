package entity;

public class Student {
    private String id;
    private String name;
    private int age;
    private float score;
    private int semester;
    private String major;


    public Student( String id, String name,int age, float score, int semester, String major) {
        this.age = age;
        this.id = id;
        this.name = name;
        this.score = score;
        this.semester = semester;
        this.major = major;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
