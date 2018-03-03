package com.study;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
        ExecutorService executor = Executors.newFixedThreadPool(7);
        outputStream.println("Enter the path to file");
        String entryFilePath = IoHandler.inputEntryFilePath(inputStream);
        try {
            List<String> directoriesToSearchIn = IoHandler.readPathsFromFile(entryFilePath);
            outputStream.println("Inputted roots path's");
            IoHandler.outputArrayOfStrings(outputStream, directoriesToSearchIn);
            for (String filePath:directoriesToSearchIn
                    ) {
                executor.submit(new RunnableCountEngine(filePath));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }
}
