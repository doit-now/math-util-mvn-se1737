/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.giaolang.mathutil.core.test;

import org.giaolang.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author giao.lang
 */
public class MathUtilityAdvancedTest {
    
    //CHUẨN BỊ SẴN RIÊNG TEST DATA, LÁT HỒI FILL VÀO HÀM
    //DDT
    //hàm trả về mảng 2 chiều, kiểu WRAPPER CLASS/OBJECT
    //mảng chứa các cặp n -> expected, ví dụ 0! -> 1; 1! -> 1; 5 -> 120
    public static Object[][] initTestData() {
        
        Object[][] testData = {{0, 1}, 
                               {1, 1}, 
                               {2, 2}, 
                               {5, 120}, 
                               {6, 7200}
                              };        
        return testData;
    }
    
    @ParameterizedTest
    @MethodSource(value = "initTestData")
    public void testFactorialGivenRigthArgumentReturnsWell(int n, long expected) {
               
        assertEquals(expected, MathUtility.getFactorial(n));        
    }
    
}

//TDD vs. DDT
//TDD - Test Driven Development
//Kĩ thuật viết code chính đan xen, xen kẽ cùng với viết Test Case/Test
//Script, tức là quá trình viết code làm app ta viết luôn những đoạn
//code (dùng thư viện Unit Test như JUnit, TestNG, xUnit, MSTest...)
//dùng để test hàm ta vừa viết

//Viết code và viết code test cùng với nhau thì gọi là
//kĩ thuật lập trình hướng về kiểm thử - TDD

//DDT - Data Driven Testing
//là kĩ thuật bổ trợ/mở rộng thêm cho kĩ thuật TDD
//là kĩ thuật viết test code mà ta tách riêng những bộ data test
//ra 1 chỗ, câu lệnh so sánh ra 1 chỗ
//kết nối, map/fill test data vào hàm test thông qua các tham số
//{6, 720} -> fill vào 2 biến n, expected và lát hồi 2 biến này
//đc fill vào tiếp cái hàm assertEquals(expected, getF(n))

//Data đc tách riêng ra, biến thành tham số cho hàm kiểm thử
//kĩ thuật này đc gọi là tách data hướng cho việc kiểm thử 
//DDT
//Còn gọi 1 tên khác là PARAMETERIZED TESTING
//KĨ THUẬT KIỂM THỬ CODE MÀ HƯỚNG VỀ THAM SỐ HOÁ CÁC DATA TEST



