package com.fileType;

public class PNGImage extends Image{
    @Override
    public void parseFile(String fileName) {
        String fileType = fileName;
        m.transMatrix(fileType);
        this.imp.doPaint(m);
    }
}
