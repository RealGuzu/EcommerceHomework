package com.example.ecommerce;

public class item {

    String desc;
    String category;
    int image;

    public item(String desc, String cat, int image) {
        this.desc = desc;
        this.category = cat;
        this.image = image;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCat() {
        return category;
    }

    public void setCat(String cat) {
        this.category = cat;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
