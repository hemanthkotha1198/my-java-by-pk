package My_First_Project;
import java.util.*;
public class Execute {
	public static void main(String args[])
	{ int i=1;
	Scanner sc = new Scanner(System.in);
		System.out.println("🙏🙏Here's that welcomes you to  railway reservations.🙏🙏");
		System.out.println("------------------------------------------------------");
		
		while(i!=0)
		{
		
			System.out.println("1).user details. ");
			System.out.println();
			System.out.println("2).Display user details");
			System.out.println();
			System.out.println("3).Train details ");
			System.out.println();
			System.out.println("4).Booking ticket ");
			System.out.println();
			System.out.println("5).Exit ");
			System.out.println();
			
			int option;
			System.out.println("Enter option: ");
			option = sc.nextInt();
			Userdetails ud= new Userdetails();
			Displaydetails dd= new Displaydetails();
			TrainDetails td =new TrainDetails();
			BookingTickets bt= new BookingTickets();
					switch(option)
			{
				case 1:
					ud.getDetails();
					break;
				case 2:
					dd.putDetails();
					break;
				case 3:
					td.trainDetails();
					break;
				case 4:
					bt.bookMyTicket();
					break;
				case 5:
					i=0;
					
					
			}
		}
	
	}

}
