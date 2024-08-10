package src.com.dhanush.JshellLearning;
//Created a seperate class to generate tables(1 to 20)

public class methodTables20_2 {

    public static void main(String[] args) {
        createTables20();           // method invoke OR method call
    }
    
    // Method should not be defined in side the void main method because its already a method.
    // we cant define a method inside other method. we can call/invoke a method inside ones class.
    public static void createTables20(){
        for (int table=1; table<=20; table++){
            System.err.println();               // this line is for printing the gap after one whole table completed.
            for(int i=1; i<=10; i++){
                System.err.printf("%d * %d = %d",table, i, table*i ).println();
            }
        }
    }

}
