package com.study;

public class FilePlusFolderCounter {
    public int file = 0;
    public int folder = 0;

    void calculateSum(FilePlusFolderCounter subCounter) {
        this.file += subCounter.file;
        this.folder += subCounter.folder;

    }
}
