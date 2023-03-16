package My_First_Project;

import java.util.Scanner;

public class BookingTickets extends TrainDetails{
	public static String brearth="";
	public static String Servicetype="";
	public static String trainnumber="";
	public static String from="";
	public static String to="";
public static void bookMyTicket()
{Scanner sc= new Scanner(System.in);

	System.out.println("From Station:");
	from=sc.nextLine();
	System.out.println("Destination:");
	to=sc.nextLine();
	System.out.println("Choice your Servicetype(Express /passenger/Demo Express):");
	Servicetype=sc.nextLine();
	System.out.println("Choice your bearth(upper/Middle/Lower)");
	brearth=sc.nextLine();
	System.out.println("Enter your Train number:");
	trainnumber=sc.nextLine();
	if(from==startposition&&to==destination) {
	if(trainnumber.equals("AbF1012")||trainnumber.equals("AbF10143")||trainnumber.equals("AbF10h46"))
	{
		System.out.println("Ticked Booked......🤝");
		displayticket();
	}}
	else
	{
		System.out.println("Invalid option or verify the details  oncw again.");
	}
}
public static void displayticket() {
	System.out.println("From:"+from+"    To:"+to+"    Date:"+date);
	System.out.println();
	System.out.println("----------------------------------------------------------");
	System.out.println("|                |                      |                |");
	System.out.println("User Name        |Age                   |Train Number    |");
	System.out.println("----------------------------------------------------------");
	System.out.println("|"+name+"        |"+age+"              |"+trainnumber+"  |");
	System.out.println("----------------------------------------------------------");
	System.out.println();
	System.out.println("Thanks for Booking......🤝");
	System.out.println();
	System.out.println("Hope you visit Again......🤝");
	
}
}
