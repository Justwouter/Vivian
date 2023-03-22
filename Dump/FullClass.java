package com.example;

import java.util.ArrayList;

public class FullClass {
    ArrayList<Integer> intList = new ArrayList<>();


    //Kijk hoe lang/
    public FullClass(){
        intList = new ArrayList(1,2,3,4,5);
        while (true) {
            if(intList.get(0) == 5 && intList.size() < 10 || intList.get(0) == 8 && intList.size() > 20){
                break;
            }
            for(int i = 0; i < intList.size(); i++){
                System.out.print(intList.get(i));
                System.out.print(" ");
            }
            System.out.println();

            for(int i = 0; i< intList.size(); i++){
                if(i != 40){
                    intList.set(i, intList.get(i)+1);
                }
               
            }

        }
        
    }
    
}
