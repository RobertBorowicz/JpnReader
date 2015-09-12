package com.app.borowicz.Rikai;

/**
 * Created by Robert on 9/10/2015.
 */
public class Inflection {

    private String inflection;
    private String inflType;
    private String base;
    private int length;
    private int type;

    public Inflection(String inflection, String base, int type, String inflType) {
        this.inflection = inflection;
        this.inflType = inflType;
        this.base = base;
        this.type = type;
        length = inflection.length();
    }

    public String getInflection() {
        return inflection;
    }

    public String getInflType() {
        return inflType;
    }

    public String getBase() {
        return base;
    }

    public int getLength() {
        return length;
    }

    public int getType() {
        return type;
    }
}
