//task four
package Qabass$;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class TaskFour {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 // Input list of integers
 System.out.print("Enter the list of integers (comma-separated): ");
 String input = scanner.nextLine();
 String[] numbers = input.split(",");
 List<Integer> originalList = new ArrayList<>();
 for (String num : numbers) {
 originalList.add(Integer.parseInt(num.trim()));
 }
 // List of squares of even numbers
 List<Integer> squaresOfEvenNumbers = new ArrayList<>();
 for (int num : originalList) {
 if (num % 2 == 0) {
 squaresOfEvenNumbers.add(num * num);
 }
 }
 System.out.println("List of squares of even numbers: " + squaresOfEvenNumbers);
 // Slicing the original list
 System.out.print("Enter the start index: ");
 int startIndex = scanner.nextInt();
 System.out.print("Enter the end index: ");
 int endIndex = scanner.nextInt();
 List<Integer> subList = originalList.subList(startIndex, endIndex);
 System.out.println("Sublist from index " + startIndex + " to " + endIndex + ": " + subList);
 scanner.close();
 
}}
//qqq