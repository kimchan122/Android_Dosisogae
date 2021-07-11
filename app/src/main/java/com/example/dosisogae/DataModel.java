package com.example.dosisogae;

import java.io.Serializable;

public class DataModel implements Serializable {
    String title;
    int image_path;
    String script;

    public String getTitle() {
        return title;
    }

    public DataModel(String title, int image_path,String script) {
        this.title = title;
        this.image_path = image_path;
        this.script=script;
    }
}
