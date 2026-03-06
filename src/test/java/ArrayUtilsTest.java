
import org.junit.jupiter.api.Test;
import utility.ArrayUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayUtilsTest {

     //Test case đúng với hàm tính tổng
     @Test
    public  void testtongdung(){
        assertEquals(500500, ArrayUtils.tinhTong());

     }

     //Test case biên trên
    @Test
    public void testBienTren(){
         long tong=1000L*(1000+1)/2;
         assertEquals(tong, ArrayUtils.tinhTong());
    }
    @Test
    //Test tính đúng đắn của hàm
    public void testTinhDungDan(){
         int n = 1000;
         long tong = n*(n+1)/2;
         assertEquals(tong, ArrayUtils.tinhTong());
    }
    @Test
    //Test tính ổn định của hàm
    public void testTinhOnDinhCuaHam(){
        long tong = ArrayUtils.tinhTong();
        long tong2 = ArrayUtils.tinhTong();
        assertEquals(tong, tong2);
    }
    @Test

    //Test tính tràn của hàm
    public void testBienTrenDan(){
         long tong = 500500;
         assertTrue(tong<Long.MAX_VALUE);
    }



}
