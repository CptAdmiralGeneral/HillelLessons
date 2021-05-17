package popovskyi.valentyn.HomeworkTest;

import java.util.Scanner;
import java.util.HashMap;
public class Main {

    public static void main(String[] args) {
        //Task 1
        Scanner scanner = new Scanner(System.in);
        int inputLength = 4;
        int number = 0;
        System.out.print("Enter a number: ");

        while(scanner.hasNext()) {
            if(scanner.hasNextInt()){
                number = scanner.nextInt();
                if(String.valueOf(number).length() <= inputLength && number>=0) {
                    return;
                } else {
                    System.out.println("ERROR: Input number was incorrect");
                    System.out.print("Enter a num: ");
                }
            } else {
                System.out.println("ERROR: Invalid Input");
                System.out.print("Enter a num: ");
                scanner.next();
            }
        }
        System.out.println("Valid! You entered: " + number);
    }
    //Task 3
        /*HashMap<Character, Integer> num = new HashMap<>();
        String input = input();
        int zeros =0;
        for (char ch : input.toCharArray()){
            if (num.containsKey(ch)){
                int i = num.get(ch);
                num.put(ch, ++i);
                if (ch =='0'){
                    zeros+=1;
                }else{
                    zeros=0;
                }
            }else {
                num.put(ch, 1);
            }
        }
        System.out.println("Zero count: " + num.get('0'));
        System.out.println("Zero at the end of num: " + zeros);
    }

    public static String input() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }*/
}
