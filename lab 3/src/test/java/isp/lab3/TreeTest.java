package isp.lab3;

import isp.lab3.exercise1.Tree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TreeTest {

    @Test
    public void testGrow() {
        Tree t=new Tree();

        assertEquals(19,t.Grow(4));
    }

    @Test
    public void testToString() {
        Tree t=new Tree();
        assertEquals("The height of the tree is 15",t.toString());
    }
}