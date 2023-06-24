package ru.homework;

public class WorkerHourly extends BasicClass {
    double hourPrice;

    public WorkerHourly(String name, String family, double hourPrice) {
        super(name, family);
        this.hourPrice = hourPrice;
    }

    @Override
    public double getSalary() {
        return 20.8 * 8 * hourPrice;
    }

    public double getHourPrice() {
        return hourPrice;
    }
}