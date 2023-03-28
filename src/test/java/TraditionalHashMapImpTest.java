import com.hashmap.api.map.HashMapImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TraditionalHashMapImpTest extends HashMapImpl<String,String> {

    @Test
    void boundsIntParseTest() {

        int bound = boundsIntParse(56);

        assertEquals(8,bound);

    }
}
