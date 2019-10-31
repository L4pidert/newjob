package ru.newwork.dlapt;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class Reader {
    public static void main(String[] Args) {
        String fileName = "c:\\temp\\ip.txt";
        File ipList = new File(fileName);
        try (
                Stream linesStream = Files.lines(ipList.toPath())) {
            System.out.println(linesStream.distinct().count());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}