import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SetArrayStringTest {

    private  SetArrayString setArrayString;

   // @org.junit.jupiter.api.BeforeAll
      void setUp(){
        setArrayString = new SetArrayString();
        setArrayString.addElements("Hello");
        setArrayString.addElements("world!");
        setArrayString.addElements("Hello");
        setArrayString.addElements("world!");
        setArrayString.addElements("Vamsi");
        setArrayString.addElements("Vamsi");
        setArrayString.addElements("Krishna!");
    }

    @Test
    void addElement() {
         setUp();
        String[] expected = {"Hello","world!","Vamsi","Krishna!"};
        Assert.assertArrayEquals(expected, setArrayString.viewElements());
    }

    @Test
    void viewElements() {
    }

    @Test
    void deleteElement() {
         setUp();
        setArrayString.deleteElement("Vamsi");
        setArrayString.deleteElement("Krishna!");
        String[] expected = {"Hello","world!"};
        Assert.assertArrayEquals(expected, setArrayString.viewElements());
    }
}