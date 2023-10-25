import java.util.Scanner;

class Show {
    public int[] test(int billingDate, int AddingNewValue, int NewValue) {
        Scanner scan = new Scanner(System.in);    
      
        System.out.print("Bills are sent on day ");
        System.out.print(billingDate);
        System.out.println(" of the month");
        System.out.println("next bill: October " + (billingDate + AddingNewValue));
        System.out.println("\n\ntest to add input a number: ");
        AddingNewValue = scan.nextInt(); // this is to test if it will add the initial number
      
        return new int[] {billingDate, (billingDate + AddingNewValue)};
    }
}

class AddingStuff {
    private int billingDate;
    private int NewValue;
   
    public void ShowNumber2(int billingDate, int NewValue) {
        System.out.print("Bills are sent on day ");
        System.out.print(billingDate);
        System.out.println(" of the month");
        System.out.println("next bill: October " + NewValue);
    }
}

public class NumbersPrintln {
    public static void main(String []args) {
        Show show = new Show();
        int[] result = show.test(5, 0, 0);
      
        AddingStuff add = new AddingStuff();
        add.ShowNumber2(result[0], result[1]);
    }
}
