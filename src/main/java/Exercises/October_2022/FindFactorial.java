package Exercises.October_2022;

import java.util.Scanner;

public class FindFactorial {

    public static int FirstFactorial(int num) {
        // code goes here ***********
// ***** WITHOUT RECURSION

//         int fact = num;
//         while(num != 1){
//           fact = fact * (num - 1);
//           num--;
//         }
//         return fact;

        //WITH RECURSION
        if(num <= 1)
            return 1;

        else{
            return num * FirstFactorial(num - 1);
        }

    }


    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number to find factorial == ");
        System.out.print("Factorial of the given number == " + FirstFactorial(s.nextInt()));
    }

}
