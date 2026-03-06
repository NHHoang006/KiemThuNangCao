package utility;

public class ArrayUtils {
//    Tính tổng các số nguyên từ 1 đến 1000
    public static long tinhTong(){
        long sum = 0;
        for( int i = 0; i <= 1000; i++ ) {
            sum += i;
        }
        return sum;
    }


}
