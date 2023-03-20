import com.hashmap.api.list.TraditionalList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class TraditionalListTest {

    private static TraditionalList<String> list;

    @BeforeAll
    void setUpList() {
        list.add("Tree");
        list.add("Flower");
    }

    @Test
    void addListElement() {
        list.add("Tiger");

        assertEquals("Tiger", list.get(2));
    }

    @Test
    void getListElement() {
        assertEquals("Tree", list.get(0));
        assertEquals("Flower", list.get(1));
    }

    @Test
    void isElementInList() {
        assertTrue(list.contains("Tree"));
        assertTrue(list.contains("Flower"));
    }

    @Test
    void removeListItem() {
        list.add("Human");
        assertEquals("Human", list.get(3));

        list.remove("Human");

        assertThrows(NoSuchElementException.class, () -> list.get(3));
    }
}
