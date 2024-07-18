package Qabass$;
import java.util.Scanner;
class TaskTwo {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter a positive decimal number: ");
 int decimalNum = scanner.nextInt();
 System.out.println("Binary equivalent: " + decimalToBinary(decimalNum));
 scanner.close();
 }
 public static String decimalToBinary(int decimalNum) {
 StringBuilder binaryEquivalent = new StringBuilder();
 while (decimalNum > 0) {
 int remainder = decimalNum % 2;
 binaryEquivalent.insert(0, remainder);
 decimalNum = decimalNum / 2;
 }
 return binaryEquivalent.toString();
 }}
