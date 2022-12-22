package org.klozevitz.superkassa_test.model.services;

import jakarta.persistence.*;

@Entity
@Table(name = "sk_example_table")
public class TestObject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private JsonObject obj;

    public JsonObject getObj() {
        return obj;
    }

    public void setObj(JsonObject obj) {
        this.obj = obj;
    }

    public TestObject() {
    }

    public TestObject(JsonObject obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "TestObject{" +
                "id=" + id +
                ", obj=" + obj +
                '}';
    }
}
