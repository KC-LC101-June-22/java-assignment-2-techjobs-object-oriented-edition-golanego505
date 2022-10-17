package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
   // protected static int nextId = 1;
    protected int id;
    protected String value;
    private static int nextId = 1;
    public JobField() {
        id = nextId;
        nextId++;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public int getId() {
        return id;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
