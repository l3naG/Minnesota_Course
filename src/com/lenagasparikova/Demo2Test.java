package com.lenagasparikova;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class Demo2Test {

    @Test
    public void mainTestInput_1() {

        String input = "1\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Demo2.main(args);

        String consoleOutput = "Enter the radius: " + System.getProperty("line.separator");
        consoleOutput += "For a circle with radius 1.0," + System.getProperty("line.separator");
        consoleOutput += " the circumference is 6.283185307179586" + System.getProperty("line.separator");
        consoleOutput += " and the area is 3.141592653589793." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());
    }

    @Test
    public void mainTestInput_3() {

        String input = "3\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Demo2.main(args);

        String consoleOutput = "Enter the radius: " + System.getProperty("line.separator");
        consoleOutput += "For a circle with radius 3.0," + System.getProperty("line.separator");
        consoleOutput += " the circumference is 18.84955592153876" + System.getProperty("line.separator");
        consoleOutput += " and the area is 28.274333882308138." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());
    }


    @Test
    public void mainTestInput_56() {
        String input = "56\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Demo2.main(args);

        String consoleOutput = "Enter the radius: " + System.getProperty("line.separator");
        consoleOutput += "For a circle with radius 56.0," + System.getProperty("line.separator");
        consoleOutput += " the circumference is 351.85837720205683" + System.getProperty("line.separator");
        consoleOutput += " and the area is 9852.03456165759." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());
    }

    @Test
    public void mainTestInput_77() {
        String input = " 77\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Demo2.main(args);

        String consoleOutput = "Enter the radius: " + System.getProperty("line.separator");
        consoleOutput += "For a circle with radius 77.0," + System.getProperty("line.separator");
        consoleOutput += " the circumference is 483.80526865282815" + System.getProperty("line.separator");
        consoleOutput += " and the area is 18626.502843133883." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());
    }

    @Test
    public void mainTestInput_99() {
        String input = "99\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String[] args = {};
        Demo2.main(args);

        String consoleOutput = "Enter the radius: " + System.getProperty("line.separator");
        consoleOutput += "For a circle with radius 99.0," + System.getProperty("line.separator");
        consoleOutput += " the circumference is 622.0353454107791" + System.getProperty("line.separator");
        consoleOutput += " and the area is 30790.74959783356." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());
    }
}
