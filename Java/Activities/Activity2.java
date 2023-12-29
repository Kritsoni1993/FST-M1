package activities;

public class Activity2 {
    public static void  main(String[] args){
        int[] numArr = {10, 77, 10, 54, -11, 10};
        int searchNum=10;
        int fixedSum=30;
        System.out.println("Result: " + result(numArr, searchNum, fixedSum));
    }
    public static boolean result(int[] numArr, int searchNum, int fixedSum){
        int sum=0;
        for(int num:numArr){
            if(num==searchNum)
                sum+=num;
        }
      return sum==fixedSum;
    }
}