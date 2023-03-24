import java.util.Scanner;
public class Exercise6 {
    //Attributes
    int studenId = 123456;

    public void printType1(int num){
        if(num == 0 ){
            System.out.println(num + "is zero");
        }else if(num < 0){
            System.out.println(num + "is negative");
        }else{
            System.out.println(num + "is positive");
        }
    }

    public void printType2(int num){
        if (num == 0) {
            System.out.println("num is zero");
        } else if (num % 2 == 0) {
            System.out.println("num is even");
        } else {
            System.out.println("num is odd");
        }
    }

    public void checkVowel(char ch){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("This character is a vowel.");
        } else {
            System.out.println("This character is not a vowel.");
        }
    }

    public void checkChar(char c) {
        if (Character.isUpperCase(c)) {
            System.out.println("Uppercase");
        } else if (Character.isLowerCase(c)) {
            System.out.println("Lowercase");
        } else {
            System.out.println("Not a letter");
        }
    }

    public  void isPositive() {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter numeber : ");
            while (!scanner.hasNextInt()) {
                System.out.print("Enter numeber : ");
                scanner.next();
            }
            num = scanner.nextInt();
        } while (num <= 0);
        
        System.out.println("Positive Number: " + num);
    }

    public void isOdd() {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter Number : ");
            while (!scanner.hasNextInt()) {
                System.out.print("Enter Number : ");
                scanner.next();
            }
            num = scanner.nextInt();
        } while (num % 2 == 0);
        
        System.out.println("Odd Number : " + num);
    }

    public void isDividedByN() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        System.out.print("Enter x: ");
        int x = scanner.nextInt();

        System.out.print("จำนวนทั้งหมดตั้งแต่ 1 - " + n + " ที่หาร " + x + " ลงตัวคือ : ");

        for (int i = 1; i <= n; i++) {
            if (i % x == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public void printStarAdvance() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter lines : ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }


    //Method
    public static void main(String[] args) {
        Exercise6 ex6 = new Exercise6 ();
        Scanner input = new Scanner(System.in);
        ex6.printStarAdvance();
    }
}