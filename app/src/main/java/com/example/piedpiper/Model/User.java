package com.example.piedpiper.Model;

public class User {

    private String id,username,imageURL,public_key;

    public User(String id, String username, String imageURL,String pkey) {
        this.id = id;
        this.username = username;
        this.imageURL = imageURL;
        this.public_key = pkey;
    }

    public User() {

    }

    public String getPublic_key() {
        return public_key;
    }

    public void setPublic_key(String public_key) {
        this.public_key = public_key;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
