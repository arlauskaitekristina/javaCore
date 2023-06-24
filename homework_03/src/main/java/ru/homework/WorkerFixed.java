package ru.homework;

public class WorkerFixed extends WorkerHourly {
    private int hourDay;

    public WorkerFixed(String name, String family, double hourPrice, int hourDay) {
        super(name, family, hourPrice);
        this.hourDay = hourDay;
    }

    @Override
    public double getSalary() {
        return 20.8 * hourPrice * hourDay;
    }

    public int getHourDay() {
        return hourDay;
    }
}