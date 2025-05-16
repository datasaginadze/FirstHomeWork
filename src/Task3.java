
//მეთოდი, რომელიც ამოწმებს არის თუ არა რიცხვი ლუწი
//(მეთოდი აბრუნებს `boolean` ტიპს. )

public class Task3 {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static void main(String[] args) {
        int num = 3;
        if (isEven(num)) {
            System.out.println(num + " ლუწი.");
        } else {
            System.out.println(num + " არ არის ლუწი.");
        }
    }
}
