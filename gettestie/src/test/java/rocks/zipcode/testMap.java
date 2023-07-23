package rocks.zipcode;
import java.util.HashMap;

import static org.junit.Assert.*;
public class testMap {




    @org.junit.Test
    public void testPut(){
        HashMap<String, String> map = new HashMap<>();
        map.put("Captain", "Holden");
        map.put("XO", "Nagata");
        map.put("Gunnery Sergeant", "Draper");

        String expected = "Nagata";
        String actual = map.get("XO");

        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void testContainsValue(){
        HashMap<String, String> map = new HashMap<>();
        map.put("Detective", "Miller");
        map.put("Captain", "Holden");
        map.put("Undersecretary", "Avasarala");

        assertTrue(map.containsValue("Miller"));
        assertFalse(map.containsValue("Naomi"));

    }

}
