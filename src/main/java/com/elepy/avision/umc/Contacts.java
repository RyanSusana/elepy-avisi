package com.elepy.avision.umc;

public final class Contacts {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    private Contacts() {
    }

    public static Contacts createContact() {
        return new Contacts();
    }

    public Contacts withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Contacts withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Contacts withEmail(String email) {
        this.email = email;
        return this;
    }

    public Contacts withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Contact build() {
        return new Contact(firstName, lastName, email, phone);
    }
}
