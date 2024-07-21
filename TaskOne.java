//task one
package Qabass$;
import java.util.Scanner;
public class TaskOne{
     public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter username: ");
     String username = scanner.nextLine();
     System.out.print("Enter password: ");
     String password = scanner.nextLine();
     System.out.print("Enter email: ");
     String email = scanner.nextLine();
     System.out.println(validateUsername(username));
     System.out.println(validatePassword(password));
     System.out.println(validateEmail(email));
     }
     public static String validateUsername(String username) {
     if (username.isEmpty()) {
     return "Username is invalid.";
     } else if (username.length() > 50) {
     return "Username is invalid.";
     } else {
     return "Username is valid.";
     }
     }
     public static String validatePassword(String password) {
     String specialSymbols = "!@#$%^&*()_+";
     if (password.length() < 8) {
     return "Password is invalid.";
     }
     if (!password.matches(".*\\d.*")) {
     return "Password is invalid.";
     }
     if (!password.matches(".*[a-z].*") || !password.matches(".*[A-Z].*")) {
     return "Password is invalid.";
     }
     if (!(password.matches(".*[" + specialSymbols + "].*"))) {
     return "Password is invalid.";
     }
     return "Password is valid.";
     }
     public static String validateEmail(String email) {
     if (!email.contains("@")) {
     return "Email is invalid";
     }
     String[] emailParts = email.split("@");
     if (emailParts.length != 2) {
     return "email is Invalid";
     }
     String usernamePart = emailParts[0];
     String domainPart = emailParts[1];
     if (!usernamePart.matches("[a-zA-Z0-9]+") || !domainPart.matches("[a-zA-Z]+")) {
     return "email is Invalid."; }
     return "Email is valid.";
     }}
    
    
