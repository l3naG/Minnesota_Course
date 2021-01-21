package com.lenagasparikova;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DemoTest {


    @Test
    public void test_is_triangle_1() {
        Assert.assertTrue(Demo.isTriangle(3, 4, 5));
    }

    @Test
    public void test_is_triangle_2() {
        Assert.assertTrue(Demo.isTriangle(5, 12, 13));
    }

    @Test
    public void test_is_triangle_3() {
        Assert.assertTrue(Demo.isTriangle(5, 13, 12));
    }

    @Test
    public void test_is_triangle_4() {
        Assert.assertTrue(Demo.isTriangle(12, 5, 13));
    }

    @Test
    public void test_is_NOT_triangle_1() {
        Assert.assertFalse(Demo.isTriangle(7, 5, 13));
    }

    @Test
    public void test_is_NOT_triangle_2() {
        Assert.assertFalse(Demo.isTriangle(13, 7, 5));
    }

    @Test
    public void test_is_NOT_triangle_3() {
        Assert.assertFalse(Demo.isTriangle(5, 13, 7));
    }

    @Test
    public void test_is_NOT_triangle_4() {
        Assert.assertFalse(Demo.isTriangle(9, 5, 3));
    }

    @Test
    public void test_is_NOT_triangle_5() {
        Assert.assertFalse(Demo.isTriangle(3, 5, 9));
    }

    @Test
    public void test_is_NOT_triangle_6() {
        Assert.assertFalse(Demo.isTriangle(5, 9, 3));
    }

    @Test
    public void test_is_NOT_triangle_7() {
        Assert.assertFalse(Demo.isTriangle(1, 2, -1));
    }

//    @Test
//    public void test_main_program_1() {
//        ByteArrayInputStream in = new ByteArrayInputStream("5\n13\n12\n".getBytes());
//        System.setIn(in);
//
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(out));
//
//        String consoleOutput = "Enter side 1: \n";
//        consoleOutput += "Enter side 2: \n";
//        consoleOutput += "Enter side 3: \n";
//        consoleOutput += "This is a triangle\n";
//
//        Assert.assertEquals(consoleOutput, out.toString());
//    }
}
