import com.hashmap.api.TraditionalHashMap;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class TraditionalHashMapTest {

    private static TraditionalHashMap<String, String> map;

    @BeforeAll
    public static void setUpMap() {
        map.put("Hello", "world");
        map.put("Tsoi", "is alive");
        map.put("Black", "BMW");
    }

    @Test
    void putElement() {
        map.put("Red", "Panther");

        assertEquals("Panther", map.get("Red"));
    }

    @Test
    void getElement() {
        assertEquals("world", map.get("Hello"));
        assertEquals("is alive", map.get("Tsoi"));
    }

    @Test
    void removeElement() {
        map.put("Universe", "is infinite");
        assertEquals("is infinite", map.get("Universe"));

        map.remove("Universe");

        assertThrows(NoSuchElementException.class, () -> {
            map.get("Universe");
        });
    }

    @Test
    void isKeyInMap() {
        assertTrue(map.containsKey("Black"));
        assertFalse(map.containsKey("Blackkkk"));
    }

    @Test
    void throwsExceptionIfKeyDoesNotExist() {
        assertThrows(NoSuchElementException.class, () -> {
            map.get("Hi!");
        });
    }

    @Test
    void replaceValueWithTheSameKey() {
        map.put("Love", "does not exist");
        assertEquals("does not exist", map.get("Love"));

        map.put("Love", "exists");
        assertEquals("exists", map.get("Love"));

    }

    @Test
    void stressedTest() {
        int boundValue = 10_000;

        for (int i = 0; i < boundValue; i++) {
            map.put("value " + i, "" + i);
        }
        assertEquals("5000", map.get("value 5000"));
        assertEquals("100", map.get("value 100"));
        assertEquals("9999", map.get("value 9999"));
    }
}