package com.study;

import java.io.InputStream;
import java.io.OutputStream;

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

    public void start(InputStream inputStream, OutputStream outputStream) {
        System.out.println("Enter the path to file");
        String entryFilePath = IoHandler.inputEntryFilePath();
        String[] derectoriesToSearchIn = IoHandler.readPathesFromFile(entryFilePath);

    }
}
