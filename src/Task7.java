
//მეთოდის გადატვირთვა (Overloading) — multiply
//(ერთი ვერსია იღებს 2 რიცხვს და აბრუნებს ნამრავლს. - მეორე ვერსია იღებს 3 რიცხვს.)


public class Task7 {
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    public static void main(String[] args) {
        int result1 = multiply(7, 9);
        int result2 = multiply(8, 6, 3);
        System.out.println("Product of two numbers: " + result1);
        System.out.println("Product of three numbers: " + result2);
    }
    }

