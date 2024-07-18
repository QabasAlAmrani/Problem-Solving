package Qabass$;
import java.util.Scanner;
class TaskThree {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int choice;
 do {
 displayMenu();
 System.out.print("Enter your choice: ");
 choice = scanner.nextInt();
 switch (choice) {
 case 1:
 displayRightAngleTriangle();
 break;
 case 2:
 displayPalindromicTriangle();
 break;
 case 3:
 displayHelp();
 break;
 case 4:
 System.out.println("Exiting the program.");
 break;
 default:
 System.out.println("Invalid choice. Please enter a valid option (1-4).");
 break;
 }
 } while (choice != 4);
 scanner.close();
 }
 public static void displayMenu() {
 System.out.println("Menu:");
 System.out.println("1. Display a right-angle triangle of ones");
 System.out.println("2. Display a Palindromic Triangle");
 System.out.println("3. Help");
 System.out.println("4. Exit");
 }
 public static void displayRightAngleTriangle() {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the number of lines: ");
 int lines = scanner.nextInt();
 for (int i = 1; i <= lines; i++) {
 for (int j = 1; j <= i; j++) {
 System.out.print("1");
 }
 System.out.println();
 }
 scanner.close();
 }
 public static void displayPalindromicTriangle() {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the number of lines: ");
 int lines = scanner.nextInt();
 for (int i = 1; i <= lines; i++) {
 for (int j = 1; j <= lines - i; j++) {
 System.out.print(" ");
 }
 for (int j = 1; j <= i; j++) {
 System.out.print("1");
 }
 System.out.println();
 }
 scanner.close();
 }
 public static void displayHelp() {

 }}
