package com.codegym;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(2,5);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));

        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(2,3,5);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
