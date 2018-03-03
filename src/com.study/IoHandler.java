package com.study;

import sun.nio.cs.UTF_32;
import sun.text.normalizer.UTF16;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class IoHandler {
    public static List<String> readPathsFromFile(String FilePath) throws FileNotFoundException {
        File newFile = new File(FilePath);
        Scanner reader = new Scanner(newFile,"cp1251");

        LinkedList<String> listToReturn = new LinkedList<>();
        while (reader.hasNext()) {
            listToReturn.add(reader.nextLine());
        }
        return listToReturn;

    }

    public static String inputEntryFilePath(InputStream inputStream) {
        Scanner scanner = new Scanner(inputStream);
        return scanner.nextLine();
    }

    public static void outputArrayOfStrings(PrintStream stream, List<String> strings) {
        for (String string : strings
                ) {
            stream.println(string);
        }
    }
}
