package contact;

// Author: Allie Lankford
// ContactServiceTest.java
// This class tests the ContactService class to make sure
// adding, updating, deleting, and getting contacts works.

import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {

    private ContactService service;
    private Contact contact1;

    @BeforeEach
    public void setup() {
        // Create a new ContactService before each test
        service = new ContactService();
        // Add one contact to start with
        contact1 = new Contact("001", "Allie", "Lankford", "1234567890", "123 Main St");
        service.addContact(contact1);
    }

    @Test
    public void testAddContact() {
        // Test adding another contact with a new unique ID
        Contact contact2 = new Contact("002", "John", "Doe", "0987654321", "456 Elm St");
        assertTrue(service.addContact(contact2));  // should be added successfully
    }

    @Test
    public void testAddDuplicateContact() {
        // Try to add a contact with a duplicate ID (should NOT be allowed)
        Contact duplicate = new Contact("001", "Jane", "Smith", "1112223333", "789 Oak St");
        assertFalse(service.addContact(duplicate));
    }

    @Test
    public void testGetContact() {
        // Make sure we can get the original contact back
        assertEquals(contact1, service.getContact("001"));
    }

    @Test
    public void testDeleteContact() {
        // Deleting the contact should return true
        assertTrue(service.deleteContact("001"));
        // After deletion, getting it should return null
        assertNull(service.getContact("001"));
    }

    @Test
    public void testUpdateContact() {
        // Update first name and phone number on the existing contact
        assertTrue(service.updateContact("001", "Alice", null, "5555555555", null));
        Contact updated = service.getContact("001");
        // Make sure the fields were updated correctly
        assertEquals("Alice", updated.getFirstName());
        assertEquals("5555555555", updated.getPhone());
    }
}
