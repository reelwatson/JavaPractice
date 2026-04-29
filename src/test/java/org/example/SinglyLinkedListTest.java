package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {
    @Test
    void practiceQueueTest() {
        SinglyLinkedList practiceList = new SinglyLinkedList();
        // Lol of course the test passes while all of the String values are hardcoded in the class
        // Yo don't tell me to autocorrect that sentence to "all the," instead of "all of the." Rude.

        assertDoesNotThrow(practiceList::practiceQueue);
    }
}