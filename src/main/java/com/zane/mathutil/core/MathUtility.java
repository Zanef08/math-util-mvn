/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zane.mathutil.core;

/**
 *
 * @author Zane
 */
// class này sẽ chứa các hàm static sinh ra để làm tool dùng chung cho các nơi khác
// Cái gì mà dùng chung cho nhiều nơi, nhận info, trả về info qua hàm mà không cần lưu trữ gì hết, cái đó nên là Static
// Đồ nào mà là static thì gọi trực tiếp qua tên class
// không bao giờ gọi static qua con đường New
public class MathUtility {
    
    public static final double PI = 3.14;
    // C#: public const double Pi = 3.14;
    // không cần chữ static mà vẫn là static nếu có từ khóa const
    // const C# - final Java
    
    // Hàm tính n! = 1,2,3,...,n
    //
    //
    //
    //
    
    public static long getFactorial (int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be 0 to 20");
        }
        if (n == 0 || n == 1) {
            return 1; //nếu có thể kết thúc sớm. thì kết thúc ngay
        }
        
        //sống sót đến chố này , sure n = 2 ... 20 Vì vậy nếu ko chết dọc đường ở 2 cum if ở trên rồi,
        //không cần else nếu trước đó xài return

        long result = 1;// giai thừa khởi đầu là 1
        // nhân dồn 2 3 4 5...n vào biến này thì thành n!

        for (int i = 2; i <= n; i++) {
            result *= i;

        }
        return result;
    }

}
