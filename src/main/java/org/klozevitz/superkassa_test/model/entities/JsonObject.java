package org.klozevitz.superkassa_test.model.services;

import java.io.Serializable;

public class JsonObject implements Serializable {
    private int current;

    public JsonObject(int current) {
        this.current = current;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    @Override
    public String toString() {
        return "{\"current\":" + current + "}";
    }
}
