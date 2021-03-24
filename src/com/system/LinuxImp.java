package com.system;

import com.Matrix;

public class LinuxImp extends ImageImp {
    @Override
    public void doPaint(Matrix m) {
        System.out.println("在Linux系统显示转化为图像矩阵m的图片！");
    }
}
