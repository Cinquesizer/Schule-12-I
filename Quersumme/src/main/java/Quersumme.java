/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josik
 * @version 1.0.1
 */
public class Quersumme {
    
    public static void main(String args[])
    {
        System.out.println("hallo");
    }
    
    int anfangszustand = 0;
    int endzustand = 1;
    int zustand = anfangszustand;

    public Quersumme(){
        System.out.println(scanner(348);
    }
    
    
    public boolean scanner(int zahl){
        for(int i = 0; i < zahl.length(); i++){
            zahlInSprache = pruefe(zahl.charAt(i))
        }
        return zahlInSprache;
    }

    public boolean pruefe(char zeichen){
        switch(zustand) {
            case 0: if(zeichen == '0' || zeichen == '3' || zeichen == '6' || zeichen == '9'){
                        zustand = 1;
                    }
                    if(zeichen == '1' || zeichen == '4' || zeichen == '7'){
                        zustand = 2;
                    }
                    if(zeichen == '2' || zeichen == '5' || zeichen == '8'){
                        zustand = 3;
                    }
            case 1: if(zeichen == '0' || zeichen == '3' || zeichen == '6' || zeichen == '9'){
                        zustand = 1;
                    }
                    if(zeichen == '1' || zeichen == '4' || zeichen == '7'){
                        zustand = 2;
                    }
                    if(zeichen == '2' || zeichen == '5' || zeichen == '8'){
                        zustand = 3;
                    }
            case 2: if(zeichen == '0' || zeichen == '3' || zeichen == '6' || zeichen == '9'){
                        zustand = 2;
                    }
                    if(zeichen == '1' || zeichen == '4' || zeichen == '7'){
                        zustand = 3;
                    }
                    if(zeichen == '2' || zeichen == '5' || zeichen == '8'){
                        zustand = 1;
                    }

            case 3: if(zeichen == '0' || zeichen == '3' || zeichen == '6' || zeichen == '9'){
                        zustand = 3;
                    }
                    if(zeichen == '1' || zeichen == '4' || zeichen == '7'){
                        zustand = 1;
                    }
                    if(zeichen == '2' || zeichen == '5' || zeichen == '8'){
                        zustand = 2;
                    }
        }
        if(zustand == endzstand){
            return true;
        }
        else{return false}
    }
}
