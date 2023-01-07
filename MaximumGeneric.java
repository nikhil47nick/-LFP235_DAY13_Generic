package com.bridgelabz.Day13;

public class  MaximumGeneric {
    Float x,y,z;
    MaximumGeneric(float x,float y,float z){
        this.x = new Float(x);
        this.y = new Float(y);
        this.z = new Float(z);
    }
    Float maximum(){
        Float max = x;
        if(y.compareTo(max)>0){
            max = y;
        }
        if(z.compareTo(max)>0){
            max = z;
        }
        return max;
    }

}
