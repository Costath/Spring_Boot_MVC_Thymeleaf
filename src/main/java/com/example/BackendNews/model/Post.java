package com.example.BackendNews.model;

public class Post {

    public String title;
    public String description;
    public String pictureUrl;
    public String content;

    public Post(String description, String pictureUrl, String content, String title) {
        this.description = description;
        this.pictureUrl = pictureUrl;
        this.content = content;
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getTile() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
