package com.study;

class RunnableCountEngine implements Runnable
{
    RunnableCountEngine(String path)
    {
        this.path = path;
    }
    private String path;
    @Override
    public void run() {
        FilePlusFolderCounter result = FileCountEngine.countFilesInDirectory(path);
        System.out.println(path + "  Files:  " + result.file + "  Folders:  " + result.folder);
    }
}