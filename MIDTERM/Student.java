import java.util.Scanner;

public class Student {
   String first_name = "";
   String middle_name = "";
   String last_name = "";
   String suffix = "";
   
   public String getFirstName() {
      return first_name;
   }
   
   public void setFirstName(String first_name) {
      this.first_name = first_name;
   }
   
   public String getMiddleName() {
      return middle_name;
   }
   
   public void setMiddleName(String middle_name) {
      this.middle_name = middle_name;
   }
   
   public String getLastName() {
      return last_name;
   }
   
   public void setLastName(String last_name) {
      this.last_name = last_name;
   }
   
   public String getSuffix() {
      return suffix;
   }
   
   public void setSuffix(String suffix) {
      this.suffix = suffix;
   }
   
   public String getFullName() {
      return first_name + " " + middle_name + " " + last_name + (suffix.isEmpty() ? "" : " " + suffix);
   }

}