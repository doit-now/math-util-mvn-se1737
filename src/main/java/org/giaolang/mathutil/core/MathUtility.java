package org.giaolang.mathutil.core;

//ta sẽ clone cái class java.util.Math của JDK mà bên trong nó chứa
//các hàm huyền thoại Math.sqrt() Math.sin() Math.random()

public class MathUtility {
    
    public static final double PI = 3.1415;
    
    
    //hàm tính n! = 1.2.3.4.5...n
    //thiết kế hàm này như sau:
    //0! = 1! = 1
    //ko có giai thừa cho số âm, -1! -2! BỊ CHỬI, NÉM RA EXCEPTION
    //giai thừa tăng nhanh, 21! kiểu long bị tràn, chứa ko nổi
    //chỉ tính giai thừa từ 0..20
    //>= 21! BỊ CHỬI, NÉM RA NGOẠI LỆ
//    public static long getFactorial(int n) {
//        
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid n. n must be between 0..20, plz.");
//        
//        if (n == 0 || n == 1) 
//            return 1;        
//        
//        long product = 1; //tích nhân dồn 1 2 3 4 5 ...
//        for (int i = 2; i <= n; i++) 
//            product *= i;
//        
//        return product;
//        
//    }
    
     public static long getFactorial(int n) {
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20, plz.");
        
        if (n == 0 || n == 1) 
            return 1;        
        return n * getFactorial(n - 1);
        
    }
    
}

//5! = 1.2.3.4.5 = 1.2.3.4     .5
//5!             = 4!         x 5
//5! = 5 x 4!
//4! = 4 x 3!
//3! = 3 x 2!
//2! = 2 x 1!
//1! = 1;  //DỪNG

//N! = N X (N - 1)!
