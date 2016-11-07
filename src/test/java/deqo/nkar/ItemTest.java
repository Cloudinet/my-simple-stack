package deqo.nkar;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void testSetGetA() throws Exception {
        // Given
        Item i = new Item();
        // When
        i.setA(2);
        // Then
        assertEquals(2, i.getA());
    }
}