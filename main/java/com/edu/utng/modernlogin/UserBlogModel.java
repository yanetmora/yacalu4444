package com.edu.utng.modernlogin;

public class UserBlogModel {
    public String image, name;

    public UserBlogModel() {
    }

    public UserBlogModel(String image, String name) {
        this.image = image;
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
