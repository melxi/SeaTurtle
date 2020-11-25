package SeaTurtle;

import java.lang.System;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

import SeaTurtle.dao.DBBookDao;
import SeaTurtle.ui.*;

public class TextUITest {

    TextUI textUI;
    Scanner s;

    @Before
    public void setUp() {
        s = new Scanner(System.in);
        textUI = new TextUI(new DBBookDao());
    }


    @Test
    public void textUICreateAndExit() {

        /*
        ByteArrayInputStream in = new ByteArrayInputStream("q".getBytes());
        System.setIn(in);

        textUI.run();
        //textUI.getInput();
        System.setIn(System.in);
        */
    }


}
