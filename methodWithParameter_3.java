public class methodWithParameter_3 {
    public static void main(String args[]){
        methodParameter(20);                       //method call/invoke, it prints as many times as i mention in the parameter
    }
    
    public static void methodParameter(int noOfTimes){      //method with parameter(noOfTimes)
        for(int i=1; i<=noOfTimes; i++)                     //for loop to print the content as many times as i want (that is as many noOfTimes)
        {
            System.out.println("printing the things"); 
        }
    }
}