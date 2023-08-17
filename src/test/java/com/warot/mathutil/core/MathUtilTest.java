/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.warot.mathutil.core;

import static com.warot.mathutil.core.MathUtil.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *import static là dành riêng cho cho những hàm static
 * gọi hàm mà bỏ qua tên class
 */
public class MathUtilTest {
//    P2
//    chơi DDT, tacchs data ra khỏi câu lệnh kiểm thử, tham số hóa data này 
//    vào trong câu lệnh kiểm thử
    
//    Chuẩn bị bộ data
    public static Object[][] initData() {
        return new Integer[][] {
                {1, 1},
                {2, 2},
                {5, 120},
                {6, 120}            
        };
    }
    
    
     @ParameterizedTest
     @MethodSource(value = "initData") // tên hàm cung cấp data, ngầm định thứ tự của các phần tử mảng, map vào tham số hàm
    public void testGetFactorialGivenRightArgReturnWell(int input, long expected) {
        assertEquals(expected,getFactorial(input));
    }
    
    
//    Phần 1
//    @Test
//    public void testGetFactorialGivenRightArgReturnWell() {
//        assertEquals(120,getFactorial(5));
//    }
    
//    bắt ngoại lệ khi đưa data cà chớn !!!
    @Test
    public void testGetFactorialGivenWrongArgThrowException(){
//        xài biểu thức Lambda
//Hàm nhận tham số thứ 2 là 1 cái object/ có code implemennt cái
//functional interface tên là Executable - có 1 hàm duy nhất không code
//tên là execute()
//chơi chậm 
//        Executable exObject = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                getFactorial(-5);
//            }
//        };

//        Executable exOject = () -> {getFactorial(-5);};
        assertThrows(IllegalArgumentException.class, () -> getFactorial(-5));
        
    }
}
