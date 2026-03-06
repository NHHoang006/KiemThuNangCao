import entity.SinhVien;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import service.SinhVienService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SinhVienServiceTest {
    protected static SinhVienService sinhVienService;

    @BeforeAll
    public static  void setUp(){
        sinhVienService = new SinhVienService();
    }

    //Test điểm hợp lệ
    @Test
    public void diemHopLe(){
        //sub dữ liệu
         SinhVien sinhVien = new SinhVien(
                "SV0001",
                "Nguyễn Huy Hoàng",
                20,
                9.5F,
                5,
                "Công nghệ thông tin");
         sinhVienService.UpdateSinhVien(sinhVien);
         assertEquals(9.5F,sinhVienService.getSinhVien().getDiemTrungBinh());

    }

    //Test điểm nhỏ hơn 0
    @Test
    public void diemNhoHon0(){
        //sub dữ liệu
        SinhVien sinhVien = new SinhVien(
                "SV0001",
                "Nguyễn Huy Hoàng",
                20,
                -1F,
                5,
                "Công nghệ thông tin");
       Exception exception=assertThrows(IllegalArgumentException.class,()->sinhVienService.UpdateSinhVien(sinhVien));
       assertEquals( "Điểm phải nằm trong khoảng từ 0 đến 10",exception.getMessage());

    }

    //Test điểm lớn hơn 10
    @Test
    public void diemLonHon10(){
        //sub dữ liệu
        SinhVien sinhVien = new SinhVien(
                "SV0001",
                "Nguyễn Huy Hoàng",
                20,
                11F,
                5,
                "Công nghệ thông tin");
        Exception exception=assertThrows(IllegalArgumentException.class,()->sinhVienService.UpdateSinhVien(sinhVien));
        assertEquals( "Điểm phải nằm trong khoảng từ 0 đến 10",exception.getMessage());

    }

    //Test điểm biên dưới(=0)
    @Test
    public void diemBang0(){
        //sub dữ liệu
        SinhVien sinhVien = new SinhVien(
                "SV0001",
                "Nguyễn Huy Hoàng",
                20,
                0F,
                5,
                "Công nghệ thông tin");
        sinhVienService.UpdateSinhVien(sinhVien);
        assertEquals(0F,sinhVienService.getSinhVien().getDiemTrungBinh());

    }

    //Test điểm biên trên(=10)
    @Test
    public void diemBang10(){
        //sub dữ liệu
        SinhVien sinhVien = new SinhVien(
                "SV0001",
                "Nguyễn Huy Hoàng",
                20,
                10F,
                5,
                "Công nghệ thông tin");
        sinhVienService.UpdateSinhVien(sinhVien);
        assertEquals(10F,sinhVienService.getSinhVien().getDiemTrungBinh());

    }



    @AfterAll
    public static void tearDown(){
        sinhVienService = null;
    }

}
