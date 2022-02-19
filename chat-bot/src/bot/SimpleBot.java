package bot;

import java.util.Scanner;

public class SimpleBot {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Charlie", "2012");
        remindName();
        guessAge();
        count();
        test();
        madLib();
        dayOfTheWeek();
        end();
    }

    static void greet(String botName, String birthYear) {
        System.out.println("Hello! My name is " + botName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    // write some silly logic based off of musical choice
    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Give me the remainders of your age divided by by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Which statement is the most accurate about break and continue?");
        System.out.println("1. The keyword break can be written in a body of while and do-while loops.");
        System.out.println("2. The keyword continue cannot be written in a body of while and do-while loops.");
        System.out.println("3. Both keywords can be written in a body of for, while and do-while loops.");
        System.out.println("4. The keywords break and continue can be written in the conditional statement if-else.");
        int answer = 3;
        int guess = scanner.nextInt();
        while (guess != answer){
            System.out.println("Please, try again.");
            guess = scanner.nextInt();
        }
    }

    static void madLib() {
        System.out.println("placeholder");
    }

    static void dayOfTheWeek() {
        System.out.println("Enter a number between 1 and 7 corresponding to a day of the week. For example, Monday would be equal to 1.");
        int day = scanner.nextInt();
        String dayString;

        // switch statement with int data type
        switch (day) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 7:
                dayString = "Sunday";
                break;
            default:
                dayString = "Invalid day";
        }
        System.out.println(dayString);
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}