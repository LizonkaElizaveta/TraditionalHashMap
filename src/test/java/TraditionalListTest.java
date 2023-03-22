import com.hashmap.api.list.TraditionalList;
import com.hashmap.api.list.TraditionalListImpl;
import com.hashmap.api.map.MapEntry;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class TraditionalListTest {

    private static TraditionalList<String> list = new TraditionalListImpl<>();

    @BeforeAll
    static void setUpList() {
        list.add("Tree");
        list.add("Flower");
    }

    @Test
    void name() {
        assertTrue(new MapEntry<String, String>("1", "2").equals(new MapEntry<String, String>("1", "2")));
    }

    @Test
    void addListElement() {
        list.add("Tiger");

        assertEquals("Tiger", list.find("Tiger"));
    }

    @Test
    void getListElement() {
        assertEquals("Tree", list.find("Tree"));
        assertEquals("Flower", list.find("Flower"));
    }

    @Test
    void isElementInList() {
        assertTrue(list.contains("Tree"));
        assertTrue(list.contains("Flower"));
    }

    @Test
    void removeListItem() {
        list.add("Human");
        assertEquals("Human", list.find("Human"));

        list.remove("Human");

        assertThrows(NoSuchElementException.class, () -> list.find("Human"));
    }
}
