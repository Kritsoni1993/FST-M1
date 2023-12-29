package activities;

public class Activity8 {
    public static void main(String[] args){
        try{
            Activity8.exceptionTest("This will execute");
            Activity8.exceptionTest(null);
            Activity8.exceptionTest("This will not execute");
        }
        catch(CustomException mae) {
            System.out.println("Inside catch block: " + mae.getMessage());
        }
    }
    public static void  exceptionTest(String input) throws CustomException {
        if (input==null){
            throw new CustomException("input string is null");
        }else {
            System.out.println(input);
        }

    }
}
