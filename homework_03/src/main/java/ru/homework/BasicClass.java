package ru.homework;

public abstract class BasicClass {
    private String name;
    private String family;

    public BasicClass(String name, String family) {
        this.name = name;
        this.family = family;
    }

    public abstract double getSalary();

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
