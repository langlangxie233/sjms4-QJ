package com;

import com.fileType.GIFImage;
import com.fileType.Image;
import com.system.ImageImp;
import com.system.WindowsImp;

public class miantest {
    public static void main(String[] args) {
        ImageImp imp = new WindowsImp();
        Image image = new GIFImage();
        Matrix m = new Matrix();
        image.setImageImp(imp);
        image.setMatrix(m);
        image.parseFile("GIF");
    }
}
