package com.elepy.avision.models;

import com.elepy.annotations.Boolean;
import com.elepy.annotations.Create;
import com.elepy.annotations.PrettyName;
import com.elepy.annotations.RestModel;
import com.elepy.avision.services.MessageCreate;
import com.elepy.models.AccessLevel;

@RestModel(name = "Message Center", slug = "/messages")
@Create(accessLevel = AccessLevel.PUBLIC, handler = MessageCreate.class)
public final class Message {

    private String id;

    @PrettyName("First Name")
    private String firstName;

    @PrettyName("Last Name")
    private String lastName;

    @PrettyName("Message Content")
    private String messageContent;

    @PrettyName("E-mail")
    private String email;

    @PrettyName("Phone Number")
    private String phone;

    @PrettyName("Message Urgency")
    @Boolean(trueValue = "This message is urgent", falseValue = "This message is not urgent")
    private boolean urgent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }
}
