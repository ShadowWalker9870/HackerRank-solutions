//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

public class Solution {
    public static void insertIntoSorted(int[] array) {
        int i = array.length - 1;
        int value = array[i];
        while (i >= 1 && array[i-1] > value) {
            array[i] = array[i-1];
            i--;
            printArray(array);
        }
        array[i] = value;
        printArray(array);        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int[] array = new int[s];
        for (int i = 0; i < s; i++) {
            array[i] = scan.nextInt(); 
        }
        insertIntoSorted(array);
    }
    
    private static void printArray(int[] array) {
        for (int num: array) {
            System.out.print(num + " ");
        }
        System.out.println();
    } 
}
