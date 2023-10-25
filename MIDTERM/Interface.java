import java.util.Scanner; 

public class Interface {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Student student = new Student();
      
      System.out.print("Enter first name: ");
      student.setFirstName(scanner.nextLine());
      
      System.out.print("Enter middle name: ");
      student.setMiddleName(scanner.nextLine());
      
      System.out.print("Enter last name: ");
      student.setLastName(scanner.nextLine());
      
      System.out.print("Enter suffix (leave blank if none): ");
      student.setSuffix(scanner.nextLine());
      
      System.out.println("\nOutput Display:");
      System.out.println("First Name: " + student.getFirstName());
      System.out.println("Middle Name: " + student.getMiddleName());
      System.out.println("Last Name: " + student.getLastName());
      System.out.println("Suffix: " + (student.getSuffix().isEmpty() ? "null" : student.getSuffix()));
      System.out.println("Full Name: " + student.getFullName());
      
      scanner.close(); 
   }
}