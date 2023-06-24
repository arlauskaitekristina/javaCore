package ru.homework;

public class WorkerMonth extends BasicClass{
    double priceMounts;

    public WorkerMonth(String name, String family, double priceMounts) {
        super(name, family);
        this.priceMounts = priceMounts;
    }

    @Override
    public double getSalary() {
        return priceMounts;
    }

    public double getPriceMounts() {
        return priceMounts;
    }


}