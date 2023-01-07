package com.bridgelabz.Day13;

public class  MaximumGeneric {
    Integer x,y,z;
    MaximumGeneric(int x,int y,int z){
        this.x = new Integer(x);
        this.y = new Integer(y);
        this.z = new Integer(z);
    }
    int maximum(){
        int max = x;
        if(y.compareTo(max)>0){
            max = y;
        }
        if(z.compareTo(max)>0){
            max = z;
        }
        return max;
    }

}
