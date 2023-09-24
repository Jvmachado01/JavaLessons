package vitor.joao.maratonajava.javacore.Aintroduction.Minterfaces.test;

import vitor.joao.maratonajava.javacore.Aintroduction.Minterfaces.domain.DataLoader;
import vitor.joao.maratonajava.javacore.Aintroduction.Minterfaces.domain.DatabaseLoader;
import vitor.joao.maratonajava.javacore.Aintroduction.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrievemaxDataSize();
        DatabaseLoader.retrievemaxDataSize();
    }

}
