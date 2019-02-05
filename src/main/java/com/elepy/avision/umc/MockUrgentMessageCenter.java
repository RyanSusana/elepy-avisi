package com.elepy.avision.umc;

public final class MockUrgentMessageCenter implements UrgentMessageCenter {
    @Override
    public void sendToSupport(String message, Contact contact) {
        System.out.println(String.format("Received the message '%s' from %s", message, contact.getName()));
    }
}
