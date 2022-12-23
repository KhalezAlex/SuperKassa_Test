package org.klozevitz.superkassa_test.model.entities;

public class PostEntity {
    private int id;
    private int add;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAdd() {
        return add;
    }

    public void setAdd(int add) {
        this.add = add;
    }

    public PostEntity(int id, int add) {
        this.id = id;
        this.add = add;
    }
}
