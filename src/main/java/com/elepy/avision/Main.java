package com.elepy.avision;

import com.elepy.Elepy;
import com.elepy.admin.ElepyAdminPanel;
import com.elepy.avision.umc.MockUrgentMessageCenter;
import com.elepy.avision.umc.UrgentMessageCenter;
import com.github.fakemongo.Fongo;
import com.mongodb.DB;

public class Main {
    public static void main(String[] args) {
        Fongo fongo = new Fongo("avision");
        DB avisionDB = fongo.getDB("avision");

        new Elepy()
                .registerDependency(DB.class, avisionDB)
                .registerDependency(UrgentMessageCenter.class, new MockUrgentMessageCenter())
                .onPort(7777)
                .addModelPackage("com.elepy.avision.models")
                .addExtension(new ElepyAdminPanel())
                .start();
    }
}
