
//მეთოდი, რომელიც იღებს double რიცხვს და აბრუნებს მას მთელ რიცხვად (Casting გამოყენებით)


public class Task4 {
        public static int convertToInteger(double number) {
            return (int) number;
        }
        public static void main(String[] args) {
            double value = 1.23;
            int result = convertToInteger(value);
            System.out.println(" Integer is: " + result);
        }
}
