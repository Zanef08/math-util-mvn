/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.zane.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Zane
 */
public class MathUtilityTest {
    
    @Test 
    public void verifyFactorialGivenRightArgument0ReturnsOk() {
        assertEquals(1, MathUtility.getFactorial(0));
    }
    
    @Test 
    public void verifyFactorialGivenRightArgument1ReturnsOk() {
        assertEquals(1, MathUtility.getFactorial(1));
    }
 
    @Test 
    public void verifyFactorialGivenRightArgument5ReturnsOk() {
        assertEquals(120, MathUtility.getFactorial(5));
    }
}
