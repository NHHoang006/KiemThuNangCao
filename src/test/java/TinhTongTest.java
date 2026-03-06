import org.junit.jupiter.api.Test;
import utility.TinhTong;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TinhTongTest {
    //Test tổng bình thường

    @Test
    public void tinhTong() {

        assertEquals(500500, TinhTong.sumArray());
    }

    //Test giá trị biên trên
    @Test
    public void tinhTongBienTren() {
        long expeted =1000L *(1000+1)/2;
        assertEquals(expeted, TinhTong.sumArray());
    }
    //Test tính đúng đắt của hàm
    @Test
    public void tinhTongTinhDungDan() {
        int n=1000;
        long expeted =(long) n*(n+1)/2;
        assertEquals(expeted, TinhTong.sumArray());
    }

    //Test tính ổn định của hàm
    @Test
    public void tinhTongOnDinh() {
        long n1 =1000L *(1000+1)/2;
        long n2 =1000L *(1000+1)/2;
        assertEquals(n1, n2);

    }

    //Test tính tổng không bị tràn
    @Test
    public void tinhTongKhongTran() {
        long n1=TinhTong.sumArray();
        assertTrue(n1 < Long.MAX_VALUE);
    }

}
