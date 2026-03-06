package service;

import entity.Student;

public class StudentService {
    //Stub dữ liệu
    protected Student student= new Student(
            "SV001",
            "Nguyễn Huy Hoàng",
            20,
            8.5F,
            3,
            "Công nghệ thông tin"

    );

    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public void updateStudent(Student newstudent) {
        if(newstudent == null) {
            throw new IllegalArgumentException("Đối tượng sinh viên không được để rỗng");
        }
        if(newstudent.getId()==null || newstudent.getId().isEmpty()
                || newstudent.getName()==null || newstudent.getName().isEmpty()
                || newstudent.getMajor()==null || newstudent.getMajor().isEmpty()) {
            throw new IllegalArgumentException("Các thuộc tính không được để rỗng.");
        }
        if(newstudent.getAge() < 18) {
            throw new IllegalArgumentException("Tuổi phải lớn hơn hoặc bằng 18.");
        }
        if(newstudent.getScore() < 0 || newstudent.getScore() > 10) {
            throw new IllegalArgumentException("Điểm phải nằm trong khoảng từ 0 đến 10");
        }

        // ✔ Gán student mới vào service
//        this.student = newstudent;
        student.setId(newstudent.getId());
        student.setName(newstudent.getName());
        student.setAge(newstudent.getAge());
        student.setScore(newstudent.getScore());
        student.setMajor(newstudent.getMajor());

    }
}
