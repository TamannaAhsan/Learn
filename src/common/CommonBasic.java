package common;

public class CommonBasic {

    public void fizzBuzz (int n){
        //number == "FizzBuzz" if n is divisible by 3 and 5.
        //number == "Fizz" if n is divisible by only 3.
        //number == "Buzz" if n is divisible by only 5.
        //number == n (as a string) if none of the above conditions are true.
        String output = "";
        if(n%3==0 && n%5==0){
            output = "FizzBuzz";
        } else if (n%3==0) {
            output = "Fizz";
        } else if (n%5==0) {
            output = "Buzz";
        }else {
            output = Integer.toString(n);
        }
        System.out.println(output);
    }
}
