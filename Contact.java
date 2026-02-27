// Author: Allie Lankford
// Contact.java
// This class represents a contact with ID, first name, last name, phone number, and address.
// This is used to store contact information and make sure all fields are valid.

package contact;

public class Contact {
    // Required fields for a contact
    private final String contactId;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    // Constructor - sets all the fields and checks rules for length/null
    public Contact(String contactId, String firstName, String lastName, String phone, String address) {
        // Contact ID must not be null or longer than 10
        if (contactId == null || contactId.length() > 10) {
            throw new IllegalArgumentException("Invalid contact ID");
        }

        // First name must not be null or longer than 10
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid first name");
        }

        // Last name must not be null or longer than 10
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name");
        }

        // Phone must be exactly 10 digits and not null
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Phone number must be exactly 10 digits");
        }

        // Address must not be null and no more than 30 characters
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Address too long");
        }

        // If everything is good, assign the values
        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    // Getters so other parts of the program can read these values
    public String getContactId() {
        return contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    // Setters for fields that are allowed to be updated

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid first name");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name");
        }
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Phone number must be exactly 10 digits");
        }
        this.phone = phone;
    }

    public void setAddress(String address) {
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Address too long");
        }
        this.address = address;
    }
}

