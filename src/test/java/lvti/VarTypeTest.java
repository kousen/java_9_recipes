package lvti;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VarTypeTest {
    @Test
    void inferString() {
        var s = "Hello, World!";
        assertEquals(String.class, s.getClass());
    }

    @Test
    void inferInteger() {
        var num = 3;
        assertTrue(Integer.valueOf(num) instanceof Integer);
    }

    @Test
    void inferListOfString() {
        var strings = List.of("this", "is", "a", "list", "of", "strings");
        assertTrue(strings instanceof List);
    }

    @Test
    void inferArrayListOfString() {
        var strings = new ArrayList<String>();
        assertEquals(ArrayList.class, strings.getClass());
    }

    @Test
    void dontDoThis() {
        var var =  new Var("var");
        assertEquals(String.class, var.getClass());
    }
}

class Var {
    private String var;

    public Var(String var) {
        this.var = var;
    }

    public String getVar() {
        return var;
    }
}
