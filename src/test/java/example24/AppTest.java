package example24;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    void isAnagram_isTrue_1(){
        boolean Actual = App.isAnagram("hitler woman", "mother in law");
        boolean Expected = true;
        assertTrue(Actual);
    }
    @Test
    void isAnagram_isTrue_2(){
        boolean Actual = App.isAnagram("tone", "note");
        boolean Expected = true;
        assertTrue(Actual);
    }
    @Test
    void isAnagram_isTrue_3(){
        boolean Actual = App.isAnagram("cake", "kace");
        boolean Expected = true;
        assertTrue(Actual);
    }
    @Test
    void isAnagram_isFalse_1(){
        boolean Actual = App.isAnagram("cake", "rice");
        boolean Expected = false;
        assertFalse(Actual);
    }
    @Test
    void isAnagram_isFalse_2(){
        boolean Actual = App.isAnagram("matthew", "on time");
        boolean Expected = false;
        assertFalse(Actual);
    }
    @Test
    void isAnagram_isFalse_3(){
        boolean Actual = App.isAnagram("Destiny", "good");
        boolean Expected = false;
        assertFalse(Actual);
    }
}
