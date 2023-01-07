package com.bridgelabz.Day13;

public class Main {
    public static void main(String[] args) {


        int xint =10,yint = 20,zint =30;
        float xfl=10.0f,yfl=30.0f,zfl=20f;
        String xs="new",ys="hello",zs="world";

        new MaximumGeneric<Integer>(xint,yint,zint).testMaximum();
        new MaximumGeneric<Float>(xfl,yfl,zfl).testMaximum();
        new MaximumGeneric<String>(xs,ys,zs).testMaximum();
    }


}
