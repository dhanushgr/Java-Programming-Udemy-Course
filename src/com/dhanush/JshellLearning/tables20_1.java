package src.com.dhanush.JshellLearning;//Printing 1 to 20 tables.

public class tables20_1 {
    public static void main(String args[]){
        for (int table=1; table<=20; table++){
            System.out.println();               // this line is for printing the gap after one whole table completed.
            for(int i=1; i<=10; i++){
                System.out.printf("%d * %d = %d",table, i, table*i ).println();
            }
        }
    }
}