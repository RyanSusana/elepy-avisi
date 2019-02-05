package com.elepy.avision.models;

import com.elepy.annotations.IdProvider;
import com.elepy.annotations.PrettyName;
import com.elepy.annotations.RestModel;
import com.elepy.annotations.Text;
import com.elepy.id.SlugIdentityProvider;
import com.elepy.models.TextType;

@RestModel(name = "Blog Articles", slug = "/articles")
@IdProvider(SlugIdentityProvider.class)
public final class BlogPost {

    private String id;

    @PrettyName("Article Title")
    private String title;

    @Text(value = TextType.TEXTAREA, maximumLength = 300)
    @PrettyName("Short Blog Intro")
    private String introduction;


    @Text(TextType.MARKDOWN)
    @PrettyName("Article Content(Markdown)")
    private String content;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
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
