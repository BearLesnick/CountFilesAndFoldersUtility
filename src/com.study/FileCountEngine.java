package com.study;

import java.io.File;
import java.nio.file.Files;
import java.util.Objects;

public class FileCountEngine {
    public static FilePlusFolderCounter countFilesInDirectory(String directoryPath) {
        FilePlusFolderCounter counter = new FilePlusFolderCounter();
        try {
            File file = new File(directoryPath);
            for (File subFile : Objects.requireNonNull(file.listFiles())
                    ) {
                if (!Files.isSymbolicLink(file.toPath())) {
                    if (subFile.isFile()) {
                        counter.file++;
                    } else {
                        counter.folder++;
                        counter.calculateSum(countFilesInDirectory(subFile.getAbsolutePath()));
                    }
                }
            }
        } catch (NullPointerException e) {
            //ignore
        }
        return counter;
    }
}
