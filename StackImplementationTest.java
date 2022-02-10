import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackImplementationTest {

    StackImplementation stack;
    @BeforeEach
    void setUp() {
        stack=new StackImplementation();
//        stack.addNode("hello");
    }

    @Test
    void testAddNode(){
        Assertions.assertTrue(stack.isEmpty());
        Assertions.assertEquals(0,stack.size());
        Assertions.assertTrue(stack.addNode("world"));
        Assertions.assertEquals(1,stack.size());
        Assertions.assertTrue(stack.addNode("hello"));
        Assertions.assertEquals(2,stack.size());
        Assertions.assertArrayEquals(new String[]{"hello","world"},stack.viewElements());
        Assertions.assertTrue(stack.popNode());
        Assertions.assertEquals(1,stack.size());
        Assertions.assertArrayEquals(new String[]{"world"},stack.viewElements());
    }

    @AfterEach
    void tearDown() {
    }
}