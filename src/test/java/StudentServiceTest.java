import entity.Student;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import service.StudentService;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentServiceTest {
    protected Student student;
    protected static StudentService studentService;

    @BeforeAll
   public static void setUp(){
        studentService = new StudentService();
    }

    // Điểm hợp lệ
    @Test
    public void updateScoreTest(){
        //Stub dữ liệu
          student= new Student(
                "SV001",
                "Nguyễn Huy Hoàng",
                20,
                7.5F,
                3,
                "Công nghệ thông tin"
        );
          studentService.updateStudent(student);
          assertEquals(7.5F,studentService.getStudent().getScore() );
    }

    //Điểm nhỏ hơn 0
    @Test
    public void updateScoreLessThan0(){
        //Stub dữ liệu
        student= new Student(
                "SV001",
                "Nguyễn Huy Hoàng",
                20,
                -1F,
                3,
                "Công nghệ thông tin"
        );
        Exception exception=assertThrows(IllegalArgumentException.class,()->studentService.updateStudent(student));
        assertEquals("Điểm phải nằm trong khoảng từ 0 đến 10",exception.getMessage() );

    }

    //Điểm lớn hơn 10
    @Test
    public void updateScoreGreaterThan10(){
        //Stub dữ liệu
        student= new Student(
                "SV001",
                "Nguyễn Huy Hoàng",
                20,
                11F,
                3,
                "Công nghệ thông tin"
        );
        Exception exception=assertThrows(IllegalArgumentException.class,()->studentService.updateStudent(student));
        assertEquals("Điểm phải nằm trong khoảng từ 0 đến 10",exception.getMessage() );
    }
    //Test biên dưới(Điểm=0)
    @Test
    public void updateScoreEquals0(){
        //Stub dữ liệu
        student= new Student(
                "SV001",
                "Nguyễn Huy Hoàng",
                20,
                0.0F,
                3,
                "Công nghệ thông tin"
        );
       studentService.updateStudent(student);
        assertEquals(0F,studentService.getStudent().getScore() );

    }

    //Test biên trên(Điểm=10)
    @Test
    public void updateScoreEquals10(){
        //Stub dữ liệu
        student= new Student(
                "SV001",
                "Nguyễn Huy Hoàng",
                20,
                10F,
                3,
                "Công nghệ thông tin"
        );
        studentService.updateStudent(student);
        assertEquals(10F,studentService.getStudent().getScore() );

    }

    

    @AfterAll
    public static void tearDown(){
        studentService = null;
    }
}
