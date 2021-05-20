package com.amircompany.javakaz;

public class JavaBas {
    private String title;
    private String info;

    public JavaBas(String title,String info){
        this.title = title;
        this.info = info;
    }

    public String getTitle(){
        return title;
    }

    public String getInfo(){
        return info;
    }

    @Override
    public String toString() {
        return title;
    }
}
