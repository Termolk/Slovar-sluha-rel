package com.example.slovarsluha.model;

import java.util.ArrayList;

public class CategoryItems {
    int id;
    String name;
    String upper;
    String downer;
    String urlVideo;


    public CategoryItems(int id, String name, String upper, String downer, String urlVideo) {
        this.id = id;
        this.name = name;
        this.upper = upper;
        this.downer = downer;
        this.urlVideo = urlVideo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUpper() {
        return upper;
    }

    public void setUpper(String upper) {
        this.upper = upper;
    }

    public String getDowner() {
        return downer;
    }

    public void setDowner(String downer) {
        this.downer = downer;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }
}
