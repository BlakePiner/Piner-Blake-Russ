import java.util.Scanner;

public class RoutesActivity {
   public void Default_Route() {      
      System.out.println("> Cebu City (Start)");
      System.out.println("> Minglanilla (Route 1)");
      System.out.println("> San Fernando (Route 2)");
      System.out.println("> CarCar (Route 3)");
      System.out.println("> Barili (Route 4.1)");
      System.out.println("> Dumanjug (Route 4.1.1)");
      System.out.println("> Alcantara (Route 4.1.2)");
      System.out.println("> Moalboal (End)");
   }
   public void Recommended_Route_1() {   
      System.out.println("> Cebu City (Start)");
      System.out.println("> Minglanilla (Route 1)");
      System.out.println("> San Fernando (Route 2)");
      System.out.println("> CarCar (Route 3)");
      System.out.println("> Sibonga (Route 4.2)");
      System.out.println("> Dumanjug (Route 4.2.1)");
      System.out.println("> Alcantara (Route 4.2.2)");
      System.out.println("> Moalboal (End)");
   }
   public void Recommended_Route_2() {
      System.out.println("> Cebu City (Start)");
      System.out.println("> Minglanilla (Route 1)");
      System.out.println("> San Fernando (Route 2)");
      System.out.println("> CarCar (Route 3)");
      System.out.println("> Sibonga (Route 4.2)");
      System.out.println("> Argao (Route 5)");
      System.out.println("> Ronda (Route 5.1)");
      System.out.println("> Alcantara (Route 5.2)");
      System.out.println("> Moalboal (End)");
   }
   
   public void Additional_data(int Speed, float distance) {
       float ETA = distance / Speed;
       int hours = (int) ETA;  // Get the whole number part (hours)
       int minutes = (int) ((ETA - hours) * 60);  // Convert the decimal part to minutes
   
       System.out.println("> Speed: " + Speed + "km/hr");
       System.out.println("> Distance: " + distance);
       
       if (minutes == 0) {
           System.out.println("> Your estimated time for arrival: " + hours + " hours");
       } else {
           System.out.println("> Your estimated time for arrival: " + hours + " hours and " + minutes + " minutes");
       }
   }
      
   public static void main (String []args) {
      Scanner scan = new Scanner(System.in);
      RoutesActivity route = new RoutesActivity(); 
      
      int number = 0;
      int number_two = 0;
      int speed = 0;
      double distance = 0;
      
      final double DISTANCE_DEFAULT = 140.8;
      final double DISTANCE_ROUTE_1 = 142.4;
      final double DISTANCE_ROUTE_2 = 153.2;
         
      System.out.println("Route to Moalboal Application \n\nDefault Route:");
      route.Default_Route();

      System.out.println("\nIs barili obstructed?: (1 = yes & 0 = no )");
      number = scan.nextInt();
      
            
      if (number == 0) {
         System.out.println("How fast are you going?:  ");
         speed = scan.nextInt();
         System.out.println("Recommended Route:");
         route.Default_Route();
         System.out.println("\nAdditional Data:");
         distance = DISTANCE_DEFAULT;
         route.Additional_data(speed, (float) distance);
      }
      while (number != 0) {
         System.out.println("Is dumanjug obstructed?: (1 = yes & 0 = no )");
         number_two = scan.nextInt();
         System.out.println("How fast are you going?:  ");
         speed = scan.nextInt();
         
         if (number == 1 && number_two == 0) {
            distance = DISTANCE_ROUTE_1; 
            System.out.println("Recommended Route:");
            route.Recommended_Route_1();
            System.out.println("\nAdditional Data:");
            route.Additional_data(speed, (float) distance);
            break;
         }
         else {
            distance = DISTANCE_ROUTE_2;
            System.out.println("Recommended Route:");
            route.Recommended_Route_2();
            System.out.println("\nAdditional Data:");
            route.Additional_data(speed, (float) distance);
            break;
         }
      }
   }
}