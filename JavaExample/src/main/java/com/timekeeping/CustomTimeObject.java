package com.timekeeping;

public class CustomTimeObject {
    
    enum Type {
        Day,
        Hour,
        Minute,
        Second,
    }

    Type valueType;
    int value;
    
    public CustomTimeObject(Type type){
        this.valueType = type;
    }
    public CustomTimeObject(Type type, int value){
        this.valueType = type;
        this.value = value;
    }

    public String returnPrintString(){
        String message = "";
        if(value > 0){
            message += value +" " +this.valueType.toString();
            if(value > 1){
                message += "s";
            }
        }
        return message;
    }



    public int getValue(){
        return value;
    }
    public String getType(){
        return valueType.toString();
    }
}


