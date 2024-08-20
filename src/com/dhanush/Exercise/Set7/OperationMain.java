package src.com.dhanush.Exercise.Set7;

public class OperationMain {
    public static void main(String[] args) {
        Operation[] operations = {new Add(), new Subtract(), new Divide()};
        for(Operation op :operations){
            System.out.println(op.perform(15,5));
        }
    }
}

interface Operation {
    int perform(int x, int y);
}

// Complete the classes below by implementing the Operation interface and providing your own implementation of the perform method.
class Add implements Operation {
    @Override
    public int perform(int x, int y) {
        return x + y;
    }
}

class Subtract implements Operation {
    @Override
    public int perform(int x, int y) {
        return x - y;
    }
}

class Divide implements Operation {
    @Override
    public int perform(int x, int y) {
        if(y > 0){
            return x/y;
        }
        return -1;
    }
}
