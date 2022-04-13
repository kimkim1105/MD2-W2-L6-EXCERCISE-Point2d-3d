package com.codegym;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        float[] XYZ = {super.getX(),super.getY(),this.z};
    }
    public float[] getXYZ(){
        float[] XYZ = {super.getX(),super.getY(),this.z};
        return XYZ;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                super.toString()+
                "z=" + z +
                '}';
    }
}
