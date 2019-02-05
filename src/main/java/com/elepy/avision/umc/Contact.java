package com.elepy.avision.umc;

public final class Contact {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phone;

    Contact(String firstName, String lastName, String email, String phone) {
        if (isEmpty(email) && isEmpty(phone)) {
            throw new IllegalArgumentException("You must have at least a phone or e-mail.");
        }
        if (isEmpty(firstName) && isEmpty(lastName)) {
            throw new IllegalArgumentException("No name provided.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }


    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        if (firstName == null && lastName != null) {
            return String.format("Mr/Mrs. %s", lastName);
        }
        if (firstName != null && lastName == null) {
            return firstName;
        }
        return firstName + " " + lastName;
    }


    private boolean isEmpty(String string) {
        return string == null || string.trim().isEmpty();
    }
}
