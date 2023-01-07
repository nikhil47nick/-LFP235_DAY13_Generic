package com.bridgelabz.Day13;

public class  MaximumGeneric {
    String x,y,z;
    MaximumGeneric(String x,String y,String z){
        this.x = new String(x);
        this.y = new String(y);
        this.z = new String(z);
    }
    String maximum(){
        String max = x;
        if(y.compareTo(max)>0){
            max = y;
        }
        if(z.compareTo(max)>0){
            max = z;
        }
        return max;
    }

}
