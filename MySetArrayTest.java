import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MySetArrayTest {

//    MySetArray myset;
    MySetLinked1 myset;
    @BeforeEach
    void setup(){
//        myset=new MySetArray();
        myset = new MySetLinked1();
    }

    @Test
    void add() {
        Assertions.assertTrue(myset.isEmpty());
        Assertions.assertTrue(myset.add("Hello"));
        Assertions.assertEquals(1,myset.size());
        Assertions.assertTrue(myset.add("world"));
        Assertions.assertEquals(2,myset.size());
    }

    @Test
    void remove() {

        Assertions.assertTrue(myset.add("Hello"));
        Assertions.assertEquals(1,myset.size());
        Assertions.assertTrue(myset.remove("Hello"));
        Assertions.assertEquals(0,myset.size());
        Assertions.assertTrue(myset.add("world"));
        Assertions.assertEquals(1,myset.size());
        Assertions.assertFalse(myset.add("world"));
        Assertions.assertEquals(1,myset.size());
        Assertions.assertTrue(myset.add("world2"));
        Assertions.assertTrue(myset.add("world3"));
        Assertions.assertTrue(myset.add("world4"));
        Assertions.assertEquals(4,myset.size());
        Assertions.assertFalse(myset.add("world3"));
        Assertions.assertTrue(myset.remove("world"));
        Assertions.assertEquals(3,myset.size());
        Assertions.assertFalse(myset.add("world4"));
        Assertions.assertEquals(3,myset.size());
        Assertions.assertTrue(myset.remove("world4"));
        Assertions.assertEquals(2,myset.size());
        Assertions.assertArrayEquals(new String[]{"world2","world3"}, myset.viewElements());
//        Assertions.assertTrue(myset.removeAll(List.of(new String[]{"Hello", "world2", "world3", "world4"})));
//       Assertions.assertArrayEquals(new String[0], myset.viewElements());
    }
}