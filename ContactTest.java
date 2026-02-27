package contact;

// Author: Allie Lankford
// ContactTest.java
// This class tests the Contact class to make sure it follows all the rules
// like maximum lengths and required fields. I wrote these tests to check
// both valid and invalid cases, now including null checks for all fields.

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    @Test
    public void testValidContactCreation() {
        // Valid case: all fields meet the requirements
        Contact contact = new Contact("123", "Allie", "Lankford", "1234567890", "123 Main St");
        assertEquals("123", contact.getContactId());       // ID is correct
        assertEquals("Allie", contact.getFirstName());     // first name set correctly
        assertEquals("Lankford", contact.getLastName());   // last name set correctly
        assertEquals("1234567890", contact.getPhone());    // phone set correctly
        assertEquals("123 Main St", contact.getAddress()); // address set correctly
    }

    // Length validations
    @Test
    public void testInvalidContactIdTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "Allie", "Lankford", "1234567890", "123 Main St");
        });
    }

    @Test
    public void testInvalidFirstNameTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123", "AllieAllieAllie", "Lankford", "1234567890", "123 Main St");
        });
    }

    @Test
    public void testInvalidLastNameTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123", "Allie", "LankfordLankford", "1234567890", "123 Main St");
        });
    }

    @Test
    public void testInvalidPhoneLength() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123", "Allie", "Lankford", "12345", "123 Main St");
        });
    }

    @Test
    public void testInvalidAddressTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123", "Allie", "Lankford", "1234567890",
                    "1234567890123456789012345678901");
        });
    }

    // ---- ADDED NULL CHECK TESTS ----
    @Test
    public void testContactIdNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "Allie", "Lankford", "1234567890", "123 Main St");
        });
    }

    @Test
    public void testFirstNameNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123", null, "Lankford", "1234567890", "123 Main St");
        });

        // Test setter null
        Contact contact = new Contact("123", "Allie", "Lankford", "1234567890", "123 Main St");
        assertThrows(IllegalArgumentException.class, () -> contact.setFirstName(null));
    }

    @Test
    public void testLastNameNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123", "Allie", null, "1234567890", "123 Main St");
        });

        Contact contact = new Contact("123", "Allie", "Lankford", "1234567890", "123 Main St");
        assertThrows(IllegalArgumentException.class, () -> contact.setLastName(null));
    }

    @Test
    public void testPhoneNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123", "Allie", "Lankford", null, "123 Main St");
        });

        Contact contact = new Contact("123", "Allie", "Lankford", "1234567890", "123 Main St");
        assertThrows(IllegalArgumentException.class, () -> contact.setPhone(null));
    }

    @Test
    public void testAddressNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123", "Allie", "Lankford", "1234567890", null);
        });

        Contact contact = new Contact("123", "Allie", "Lankford", "1234567890", "123 Main St");
        assertThrows(IllegalArgumentException.class, () -> contact.setAddress(null));
    }

 
    @Test
    public void testSettersValidUpdate() {
        Contact contact = new Contact("999", "First", "Last", "1234567890", "123 Main St");

        contact.setFirstName("NewFirst");
        contact.setLastName("NewLast");
        contact.setPhone("0987654321");
        contact.setAddress("456 Elm St");

        assertEquals("NewFirst", contact.getFirstName());
        assertEquals("NewLast", contact.getLastName());
        assertEquals("0987654321", contact.getPhone());
        assertEquals("456 Elm St", contact.getAddress());
    }
}
