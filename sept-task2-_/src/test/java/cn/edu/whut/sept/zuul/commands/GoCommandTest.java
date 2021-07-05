package cn.edu.whut.sept.zuul.commands;

import cn.edu.whut.sept.zuul.Game;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.*;

public class GoCommandTest {
    private PrintStream console = null;
    private ByteArrayOutputStream byteArrayOutputStream = null;
    private ByteArrayInputStream  byteArrayInputStream = null;
    private Game game;
    private GoCommand goCommand;

    @Before
    public void before() {
        byteArrayOutputStream = new ByteArrayOutputStream();
        console = System.out;
        System.setOut(new PrintStream(byteArrayOutputStream));
        game = new Game();
        goCommand = new GoCommand();
    }

    @After
    public void after() {
        System.setOut(console);
    }

    @Test
    public void testGoEast() {
        goCommand.setSecondWord("east");
        goCommand.execute(game);


        String except = "You are in a lecture theater.\nExits: west\r\n";
        assertEquals(except, byteArrayOutputStream.toString());
    }
}