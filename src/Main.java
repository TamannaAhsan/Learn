import array.ArrayBasic;
import common.CommonBasic;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1 ,2 ,8, 3 ,2, 2, 2,5,1};
        int n = 22;

        ArrayBasic arrayBasic = new ArrayBasic();
        CommonBasic commonBasic = new CommonBasic();
        arrayBasic.findFrequencyInArray(arr);
        commonBasic.fizzBuzz(n);


    }
}