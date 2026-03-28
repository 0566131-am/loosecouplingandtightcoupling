package com.example;

public class AuthorImpl implements Author {
    private String name;
    private String bio;

    public AuthorImpl(String name, String bio) {
        this.name = name;
        this.bio = bio;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getBio() {
        return bio;
    }
}
