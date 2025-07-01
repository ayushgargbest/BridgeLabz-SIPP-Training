import java.util.*;
public class CoffeeCounter
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int espresso=329;
        int latte=419;
        int cappuccino=259;
        int americano=949;
        while(true)
        {
            System.out.print("\nEnter coffee type (espresso, latte, cappuccino, americano) or 'exit' to stop: ");
            String s=sc.next().toLowerCase();
            System.out.print("Enter quantity: ");
            int quantity=sc.nextInt();
            int chosenCoffeePrice=0;
            if(s.equals("exit"))
            {
                System.out.print("Thank you have a nice day!");
                break;
            }
            switch(s)
            {
                case "espresso":
                    chosenCoffeePrice=espresso;
                    break;
                case "latte":
                    chosenCoffeePrice=latte;
                    break;
                case "americano":
                    chosenCoffeePrice=americano;
                    break;
                case "cappuccino":
                    chosenCoffeePrice=cappuccino;
                    break;
            }
            int total=chosenCoffeePrice*quantity;
            double gst=total*0.18;
            double finalAmount=total+gst;
            System.out.printf("Subtotal: ₹%d\n",total);
            System.out.printf("GST (18%%): ₹%.2f\n",gst);
            System.out.printf("Total Bill: ₹%.2f\n",finalAmount);
        }
    }
}