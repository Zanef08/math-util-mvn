/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.zane.mathutil.core.test;

import com.zane.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Zane
 */
public class MathUtilityDDTTest {

    //ta cần chuẩn bị bộ data để nhồi vào cái hàm qua 2 hàm số đã chừa sẵn
    // kĩ thuật tách data kiểm thử ra khỏi câu lệnh so sánh
    // để data ở riêng 1 chỗ, từ từ fill vào hàm so sánh
    // kĩ thuật này gọi là DDT DATA DRIVEN TESTING
    // data thường sẽ để ở mảng 2 chiều
    // 1 cái là đầu vào n, 1 cái là đầu ra expected
    // và có nhiều cặp như thế
    // kĩ thuật này còn gọi là tham số hóa kiểm thử 
    // đưa data vào qua tham số hàm
    // mảng 2 chiều này sẽ nhồi vào hàm ở dưới
    public static Object[][] initdata() {
        Object[][] dataSet = {{0, 1},
        {1, 1},
        {3, 6},
        {4, 24},
        {5, 120}};
        return dataSet;
    }

    @ParameterizedTest
    @MethodSource("initdata")
    public void verifyFactorialGivenRightArgumentReturnsOk(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }

}
