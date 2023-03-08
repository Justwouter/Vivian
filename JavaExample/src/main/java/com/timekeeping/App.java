package com.timekeeping;

import com.timekeeping.CustomTimeObject.Type;

public class App {
    CustomTimeObject days = new CustomTimeObject(Type.Day, 1);
    CustomTimeObject hours = new CustomTimeObject(Type.Hour, 3);
    CustomTimeObject minutes = new CustomTimeObject(Type.Minute, 0);
    CustomTimeObject seconds = new CustomTimeObject(Type.Second, 45);
    public CustomTimeObject[] myTimeArray;

    
    public App(){
        this.myTimeArray = new CustomTimeObject[]{days, hours, minutes, seconds};
        String message = "";
        for(CustomTimeObject iteration : this.myTimeArray){
            if(iteration == this.myTimeArray[this.myTimeArray.length-1]){
                message += "and ";
            }
            message+= iteration.returnPrintString()+" ";
        }
        System.out.println(message);


    }
}
