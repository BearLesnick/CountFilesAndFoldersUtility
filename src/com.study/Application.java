package com.study;

import java.io.InputStream;
import java.io.PrintStream;

public final class Application {
    private Application() {
    }

    private static Application instance = null;

    public static synchronized Application getInstance() {
        if (instance == null) {
            instance = new Application();
            return instance;
        } else {
            return instance;
        }
    }

    public void start(InputStream inputStream, PrintStream outputStream) {
        outputStream.println("Enter the path to file");
        String entryFilePath = IoHandler.inputEntryFilePath(inputStream);
        /*try {
            List<String> directoriesToSearchIn = IoHandler.readPathsFromFile(entryFilePath);
            outputStream.println("Inputted roots path's");
            IoHandler.outputArrayOfStrings(outputStream, directoriesToSearchIn);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        System.out.println(FileCountEngine.countFilesInDirectory(entryFilePath).file + " "+ FileCountEngine.countFilesInDirectory(entryFilePath).folder);
    }
}
