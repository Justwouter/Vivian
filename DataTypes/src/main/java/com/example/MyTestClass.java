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
        //Er zit geen (reasonable) limiet aan hoeveel waardes deze kan bevatten zolang deze van hetzelfde type zijn e.g. Integer, String, Char, Double

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
        //Dit zijn methodes. Methodes kan je herkennen aan de ronde brackets () achter de naam van de methode.
        //Als programmeur vind je het niet fijn om meerdere keren dezelfde code te schrijven en gigantische lappen code zijn niet fijn om doorheen te lezen
        //Daarom splits je de functionaliteit van een grote hoeveelheid code uit in kleinere, leesbaardere stukjes die makkelijk hergebruikt kunnen worden.

        //In plaats van 3x de code uit te schrijven kan ik 3x printIntArrayToConsole() aanroepen
        printIntArrayToConsole(myIntArray);
        printIntArrayToConsole(myIntArray);
        printIntArrayToConsole(myIntArray);

        //Iedere methode bevat zijn eigen lokale variablen. Dit zijn alle variablen die niet direct in een class staan e.g.
        int testInt = 0; //Dit is een lokale var
        //Nu willen we alleen wel die lokale variablen kunnen gebruiken in een andere methode
        //Dit doe je door de variable in kwestie binnen de haakjes van de methode te zetten
        printIntAndAdd(testInt /*<- testInt wordt meegegeven aan de methode */);

        //Soms wil je een lange berekening ofzo uitvoeren in een methode
        //De output hiervan wil je natuurlijk wel terug hebben
        //Dit kan door een return type aan de methode toe te voegen. Dit (bijna) iedere soort data zijn e.g. int, String, ArrayList
        //Als je niets wil returnen gebruik je het keyword "void"

        //Wat je dan krijgt: public int doeIets(int nummer){}
        //public: visability declaration, hoef je nog niet te weten
        //int: return type, het type object wat de methode terug geeft wanneer deze wordt gebruikt
    }


    public int printIntAndAdd(int i){
        System.out.println(i);
        return i+1;
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
