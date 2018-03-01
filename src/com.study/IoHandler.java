package com.study;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.OutputStream;
import java.io.PrintStream;

public class IoHandler {
    public static String[] readPathesFromFile(String FilePath) {
        throw new NotImplementedException();
    }

    public static String inputEntryFilePath() {
        throw new NotImplementedException();
    }

    public static void outputArrayOfStrings(PrintStream stream, String[] strings) {
        for (String string : strings
                ) {
            stream.println(string);
        }
    }
}
