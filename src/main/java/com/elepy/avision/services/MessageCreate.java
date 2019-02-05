package com.elepy.avision.services;

import com.elepy.annotations.Inject;
import com.elepy.avision.models.Message;
import com.elepy.avision.umc.Contacts;
import com.elepy.avision.umc.UrgentMessageCenter;
import com.elepy.dao.Crud;
import com.elepy.di.ElepyContext;
import com.elepy.exceptions.ElepyException;
import com.elepy.routes.SimpleCreate;

public class MessageCreate extends SimpleCreate<Message> {

    @Inject
    private UrgentMessageCenter urgentMessageCenter;


    @Override
    public void beforeCreate(Message message, Crud<Message> crud, ElepyContext elepyContext) {

        //Hmm, maybe time to add a TextType.EMAIL?
        if (message.getEmail() != null && !message.getEmail().isEmpty() && !message.getEmail().contains("@")) {
            throw new ElepyException(String.format("The email '%s' is invalid.", message.getEmail()), 400);
        }
    }

    @Override
    public void afterCreate(Message message, Crud<Message> crud, ElepyContext elepyContext) {

        if (message.isUrgent()) {
            urgentMessageCenter
                    .sendToSupport(
                            message.getMessageContent(),
                            Contacts
                                    .createContact()
                                    .withEmail(message.getEmail())
                                    .withPhone(message.getPhone())
                                    .withFirstName(message.getFirstName())
                                    .withLastName(message.getLastName())
                                    .build());
        }
    }
}
