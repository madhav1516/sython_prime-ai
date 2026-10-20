package sythonPrime_ai;

import java.util.Scanner;

public class listen {
    static Scanner keyboard = new Scanner(System.in);

    static  String hear(){
        System.out.print("You >");
        return keyboard.nextLine();
    }
}
