
//მეთოდი, რომელიც აბრუნებს String-ის სიგრძეს
//( მეთოდი იღებს `String` ტიპს და აბრუნებს მასში სიმბოლოების რაოდენობას)

public class Task6  {

        public static int getStringLength(String text) {
            return text.length();
        }

        public static void main(String[] args) {
            String myText = "SDET";
            int length = getStringLength(myText);
            System.out.println("Strin Lenght is: " + length);
        }
}
