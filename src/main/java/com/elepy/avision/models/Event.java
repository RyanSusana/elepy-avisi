package com.elepy.avision.models;

import com.elepy.annotations.*;
import com.elepy.annotations.Number;
import com.elepy.id.SlugIdentityProvider;
import com.elepy.models.TextType;

import java.math.BigDecimal;

@RestModel(name = "Events", slug = "/events")
@IdProvider(SlugIdentityProvider.class)
public final class Event {

    private String id;

    @PrettyName("Event Title")
    private String title;

    @PrettyName("Event Description (HTML)")
    @Text(TextType.HTML)
    private String description;

    @PrettyName("Event Price")
    @Number(minimum = 0)
    private BigDecimal price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
