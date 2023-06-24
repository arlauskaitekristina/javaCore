package ru.homework;

import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        // Написать функцию, создающую резервную копию всех файлов в директории(без поддиректорий) во вновь созданную папку ./backup
        DirectoryBackup directoryBackup = new DirectoryBackup();
        directoryBackup.backupFiles(Path.of("."));

        // Доработайте класс Tree и метод print который мы разработали на семинаре. Ваш метод должен распечатать полноценное дерево
        // директорий и файлов относительно корневой директории.
        TreePrint.print(Path.of("./src"));
    }
}