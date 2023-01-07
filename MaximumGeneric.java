package com.bridgelabz.Day13;

import java.util.Stack;
import java.util.concurrent.ConcurrentMap;

public class  MaximumGeneric <T extends Comparable<T>>{
    T x,y,z,max;
    MaximumGeneric(T x,T y,T z){
        this.x = x;
        this.y = y;
        this.z = z;
        this.max = x;
    }

    public T testMaximum(){
        return testMaximum(x,y,z,max);
    }
   public static <T extends Comparable<T>> T  testMaximum(T x,T y,T z,T max){
        if(y.compareTo(max)>0){
            max = y;
        }
        if(z.compareTo(max)>0){
            max = z;
        }
        printMax(x,y,z,max);
        return max;
    }

    public static <T> void printMax(T x,T y,T z,T max){
        System.out.println("Number "+x+" "+y+" "+z+"  The Maximum is :"+max);
    }



}
