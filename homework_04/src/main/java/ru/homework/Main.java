package ru.homework;

import static java.lang.Integer.valueOf;

public class Main {
    public static void main(String[] args) {

        String[][] stringArray1 = new String[][] {
                {"01", "02", "03", "04"},
                {"05", "06", "07", "08"},
                {"09", "10", "mm", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] stringArray2 = new String[][] {
                {"01", "02", "03", "04"},
                {"05", "06", "07", "08"},
                {"09", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] stringArray3 = new String[][] {
                {"01", "02", "03", "04"},
                {"05", "06", "07", "08"},
                {"09", "10", "11", "12"}
        };

        try {
            System.out.println("Сумма элементов массива равна " + sumofNumbers(stringArray1));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма элементов массива равна " + sumofNumbers(stringArray2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма элементов массива равна " + sumofNumbers(stringArray3));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
    }

    private static int sumofNumbers (String[][] in) throws MyArraySizeException, MyArrayDataException {
        int lenArr = 4;
        int sum = 0;

        // Проверяем, что у массива 4 основных измерения
        if (in.length != 4) {
            throw new MyArraySizeException(String.format("Размерность массива должна быть %dх%d.", lenArr, lenArr));
        }
        // Т.к. размерность вложенных массивов может быть не всегда одинакова, то проверяем, что в каждом 
        //из 4-х основных измерений находится массив ровно из 4 элементов
        for (int i = 0; i < in.length; i++) {
            if (in[i].length != 4) {
                throw new MyArraySizeException(String.format("Размерность массива должна быть %dх%d.", lenArr, lenArr));
            }
        }

        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in[i].length; j++) {
                try {
                    sum += valueOf(in[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("В позиции [%d][%d] исходного массива находится не целое число %s.", i, j, in[i][j]));
                }
            }
        }

        return sum;
    }

}
