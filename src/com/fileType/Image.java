package com.fileType;

import com.Matrix;
import com.system.ImageImp;

public abstract class Image {
    protected ImageImp imp;
    protected Matrix m;
    public void setImageImp(ImageImp imp){
        this.imp = imp;
    }
    public void setMatrix(Matrix m){
        this.m = m;
    }
    public void parseFile(String fileName){

    }
}
