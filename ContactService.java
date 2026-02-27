package contact;

// Author: Allie Lankford
// ContactService.java
// This class provides services to add, update, delete, and get contacts.
// It stores contacts in memory using a Map (no database needed).

import java.util.HashMap;  
import java.util.Map;

public class ContactService {

    // A map to hold all contacts with the contact ID as the key
    private Map<String, Contact> contacts;

    public ContactService() {
        // Initialize the map when the service is created
        contacts = new HashMap<>();
    }

    // Adds a new contact if the ID is not already used
    public boolean addContact(Contact contact) {
        if (contacts.containsKey(contact.getContactId())) {
            // If the ID already exists, we can't add it
            return false;
        }
        contacts.put(contact.getContactId(), contact);
        return true;
    }

    // Gets a contact by its ID
    public Contact getContact(String contactId) {
        return contacts.get(contactId);
    }

    // Deletes a contact by ID
    public boolean deleteContact(String contactId) {
        if (!contacts.containsKey(contactId)) {
            // If the ID isn't found, we can't delete it
            return false;
        }
        contacts.remove(contactId);
        return true;
    }

    // Updates one or more fields of a contact
    // Only updates the fields that are not null
    public boolean updateContact(String contactId, String firstName, String lastName, String phone, String address) {
        Contact contact = contacts.get(contactId);

        if (contact == null) {
            // If the contact doesn't exist, we can't update it
            return false;
        }

        // Only change a field if a new value was provided
        if (firstName != null) {
            contact.setFirstName(firstName);
        }
        if (lastName != null) {
            contact.setLastName(lastName);
        }
        if (phone != null) {
            contact.setPhone(phone);
        }
        if (address != null) {
            contact.setAddress(address);
        }

        return true;
    }
}

