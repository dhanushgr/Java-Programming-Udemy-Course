package src.com.dhanush.learnJava.character;

public class MyChar {

    private char ch;

    //default constructor
    MyChar(){
    }

    //constructor with args
    MyChar(char ch){
        this.ch = ch;
    }


    public boolean isVowel(){

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
           return true;
        }
        
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
           return true;
        }
        else
            return false;
    }


    public boolean isDigit(){           //char can also have digits in it. it follows unicode
        if(ch>=48 && ch<=57){           //In UniCode 48-->'0' and 57-->'9'.
            return true;
        }
        else
            return false;

    }


    public boolean isAlphabet(){
        if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){
            return true;
        }
        else
            return false;
    }

    public static void printLowerCaseAlphabets(){  //this is static 
        for(char ch ='a'; ch <='z'; ch++){
            System.out.println(ch);
        }
    }
    
    
    public static void printUpperCaseAlphabets(){
        for(char ch ='A'; ch <='Z'; ch++){
            System.out.println(ch);
        }
    }
}
