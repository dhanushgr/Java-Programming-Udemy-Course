public class methodOverloadingTables_4{

    //In this below code snipets 
    // the same method is being bring called twice , once with parameter and once as it is. This is called as over loading.
    // method name is same. It depends how you call it, With parameter or without parameter

    public static void main(String args[]){
        printTablesMethod();              //this method calls the default method
                System.out.println();//this line is just for adding a new line
        printTablesMethod(5);        //when you pass the value to the parameter, that value is called "argument". 
    }                                      //In this case 5 is the argument


    public static void printTablesMethod(){     //This is the method with no parameter, 
                                                // it always perfoms the tableMultiplication for 8 itlsef until you change it manually. this is integer literal
        for(int i=1; i<=10; i++){
            System.out.printf("%d * %d = %d", 8, i, 8*i).println();
         }
    }


    public static void printTablesMethod(int table) {   //This is the method with some parameter(table) given to it

         for(int i=1; i<=10; i++){
            System.out.printf("%d * %d = %d", table, i, table*i).println();
         }
            
    }
}
