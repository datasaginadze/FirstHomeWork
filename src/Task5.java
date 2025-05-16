
//მეთოდი, რომელიც აბრუნებს ორ რიცხვს შორის უფრო დიდს
//(მეთოდი იღებს ორ `int` რიცხვს და აბრუნებს მათ შორის დიდ რიცხვს `if/else` ლოგიკის გამოყენებით.)

public class Task5 {
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        int result = max(2, 99);
        System.out.println("Higher Number: " + result);
    }
}
