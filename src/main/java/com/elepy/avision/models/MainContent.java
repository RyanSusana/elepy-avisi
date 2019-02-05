package com.elepy.avision.models;

import com.elepy.annotations.IdProvider;
import com.elepy.annotations.PrettyName;
import com.elepy.annotations.RestModel;
import com.elepy.annotations.Text;
import com.elepy.id.SlugIdentityProvider;
import com.elepy.models.TextType;

@RestModel(name = "Main Content", slug = "/content")
@IdProvider(SlugIdentityProvider.class)
public final class MainContent {

    private String id;

    @PrettyName("Content Title")
    private String title;

    @PrettyName("Content (MARKDOWN)")
    @Text(TextType.MARKDOWN)
    private String content;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
