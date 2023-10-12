/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.zane.mathutil.main;

import com.zane.mathutil.core.MathUtility;

/**
 *
 * @author Zane
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test case 1: (chi tiết ở dưới)
        int n = 0; // hàm ý kiểm tra 0!
        long expected = 1; // hàm ý hy vọng rằng n = 0! phải trả về 1
        long actual = MathUtility.getFactorial(n); // thực tế là mấy, gọi hàm là biết ngay
        
        // so sánh giữa expected == actual hay k?
        System.out.println(n + "! -> expected " + expected + " | actual: " + actual);
        
        // Test case 2:
        n = 5;
        expected = 120;
        actual = MathUtility.getFactorial(n);
        
        System.out.println(n + "! -> expected " + expected + " | actual: " + actual);
        
    }
    
}

// Dân dev viết ra code: hàm, class Đồng thời phải có trách nhiệm test code của mình
// Làm sao test code của chính mình
// Có 3 cách
// Cách 1: in ra màn hình kết quả xử lí của hàm
// Cách 2: in ra Log file
// Cách 3: Dùng đồ chơi bên ngoài đem vào - thư viện đem vào

// Nhưng dù là kiểm thử thế nào thì cũng gồm 3 công việc
// Thiết kế Test case
// Thực thi Test case - Test Run
// Ghi Bug nếu có = Log Bug

// Test case: bộ data dduwa vào app để xem app hành xử đúng không
//            kèm thêm Expected value để xem app có trả về đúng k
//            kèm thêm hướng dẫn sử dụng app với data đưa vào 
//            kèm thêm trạng thái của test case: app đúng hay sai

// Cấu trúc của 1 Test case
//(Dùng trong thực tế đi làm, và dùng trong đề thi PE)

// Một Test case gồm những info sau:
// Test case ID | Test case Description | Steps/Procedures
// Expected result | Status (Passed | Failed)

// Test case là tình huống xài app với bộ data đưa vào và giá trị kì vọng app phải trả về
// Giờ ta muốn test hàm getF() ta phải thiết kế các test case coi xem hàm trả về đúng k

//Test case 1: Verify getFactorial (with n = 0) check 0! correct or not?
// Test Steps/ Procedures
// 1. Given n = 0;
// 2. Call/ Invoke getFactorial (n = 0)

//EXPCTED RESULT:
//                  The method must return 1 as the result òf 0!

//STATUS: PASSED | FALLED, just waiting the method returns value
                                        //Đoán xem

//Câu 3 bài thi PE viết ra khoảng 10 cái test case như trên

//Test case 2: Verify getFactorial (with n = 5) check 5! correct or not?
// Test Steps/ Procedures
// 1. Given n = 5;
// 2. Call/ Invoke getFactorial (n = 5)

//EXPCTED RESULT:
//                  The method must return 1 as the result of 5!

//STATUS: PASSED | FALLED, just waiting the method returns value
                                        //Đoán xem