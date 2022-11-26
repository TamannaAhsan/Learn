package recursion;

public class RecursionBasic {
    public static void main(String[] args) {

        int n = 0;
        //simpleRecursionExample(n);

        Integer fact = factorial(n);
        System.out.println(fact);
    }

    public static void simpleRecursionExample(int n){

        if(n==0){
            return;
        }
        simpleRecursionExample(n-1);

        System.out.println(n);
    }

    public static int factorial (int n){

        if(n<0)
            return -1;
        if(n == 1){
            return 1;
        }
        return (n * factorial(n-1));
    }
}
