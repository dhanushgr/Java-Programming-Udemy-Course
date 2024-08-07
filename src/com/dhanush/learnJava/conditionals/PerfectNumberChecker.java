public class PerfectNumberChecker {
    int addUpNumber;

    public boolean isPerfectNumber(int number) {
        if(number>0){
            for(int i=1; i<number; i++){
                if(number%i==0){
                   addUpNumber = addUpNumber + i;
                }
            }
            if(addUpNumber == number){
                return true;
            }
        }
        return false;
    }
}