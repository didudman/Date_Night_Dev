package com.example.david.datenightdev;

/**
 * Created by david on 16/05/2016.
 * new class to hold information for cardView
 */
public class MainDataDef {
    int image;
    String name;
    String summary;
    public MainDataDef(int image, String name, String summary){
        this.image = image;
        this.name = name;
        this.summary = summary;
    }

    public int getImage() { return image;}
    public String getName(){ return name;}
    public String getSummary(){ return summary;}
}
