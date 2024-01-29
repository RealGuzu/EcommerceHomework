package com.example.ecommerce;

public class item {

    String desc;
    String cat;
    int image;

    public item(String desc, String cat, int image) {
        this.desc = desc;
        this.cat = cat;
        this.image = image;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
