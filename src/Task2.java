
//მეთოდი, რომელიც აბრუნებს ორი მთელი რიცხვის ჯამს
//(მეთოდი იღებს ორ `int` ტიპის რიცხვს, აბრუნებს მათ ჯამს და ტიპი არის `int`.)

import static java.lang.Integer.sum;

public class Task2 {
    public static int sum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        int result = sum(10, 20);
        System.out.println("Sum : " + result);
    }
}

