package com.example;

import java.util.ArrayList;

public class MyTestClass {
    public ArrayList<Integer> myIntArrayList = new ArrayList<>();
    public int[] myIntArray;

    public MyTestClass(){

        /*============Arrays========================= */

        //Arrays zijn fixed length.
        //Dit betekend dat ze altijd hetzelfde aantal waardes bevatten
        //e.g. 5 waardes in dit voorbeeld
        myIntArray = new int[5];
        System.out.println(myIntArray.length);

        //Om de lengte te veranderen moet het object opnieuw aangemaakt worden
        //De oude waardes gaan hierbij verloren
        myIntArray = new int[10];
        System.out.println(myIntArray.length);

        //De lengte van een array bepaald hoe veel waardes er in die array kunnen
        //Als je de inhoud van de array al weet kan je die direct inladen
        myIntArray = new int[]{1,2,3,4,5,6,7};
        printIntArrayToConsole(myIntArray);

        //Je interact met de array door de index (beginnend bij 0 voor de eerste waarde) tussen de brackets te zetten
        System.out.println(myIntArray[0]);
        //Dit geld ook voor het veranderen van waardes in de array
        myIntArray[0] = 50;
        printIntArrayToConsole(myIntArray);


        System.out.println("============ArrayLists========================="); 

        //Arraylists zijn -in tegestelling tot Arrays- variable length
        //Er zit geen (reasonable) limiet aan hoeveel waardes deze kan bevatten

        //Omdat Arraylists abstractere collecties zijn kunnen we niet direct met de variablen van de Arraylist interacten
        //Om toch onze waardes uit te kunnen lezen zijn hier methodes voor gemaakt.
        //E.g. .add(waarde), .size() & .get(index)
        System.out.println(myIntArrayList.size());

        //Voeg 25 nummers toe aan de list
        for(int i = 1; i <= 25; i++){
            myIntArrayList.add(i);
        }
        System.out.println(myIntArrayList.size());
        printIntArrayListToConsole(myIntArrayList);

        //Verwijder het laatste nummer uit de lijst.
        //.size() geeft het totale aantal waardes in de lijst vanaf 1
        //Indexes starten bij 0 dus er moet 1 van de size afgehaald worden
        myIntArrayList.remove(myIntArrayList.size()-1);
        printIntArrayListToConsole(myIntArrayList);

        //Je kan arraylists beschouwen als een soort makkelijke arrays
        //Waar je bij arrays een compleet nieuwe array zou moeten aanmaken en de data van de oude naar de nieuwe array
        //naar de nieuwe array zou moeten kopieren regelt de ArrayList dit voor je.
        //Er zitten dus redelijk wat handigheidjes in o.a. dat als je een index verwijderd de rest van de lijst verschuifd
        

        System.out.println("============Methodes========================="); 

        //Je hebt misschien al gezien dat er zo nu en dan printIntArrayListToConsole() of printIntArrayToConsole() werdt gebruikt
        //Dit zijn methodes. methodes kan je herkennen aan de ronde brackets () achter de naam van de methode.
        

    }

    

    public void printIntArrayToConsole(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public void printIntArrayListToConsole(ArrayList<Integer> array){
        for(int i = 0; i < array.size(); i++){
            System.out.print(array.get(i));
            System.out.print(" ");
        }
        System.out.println();
    }
}
