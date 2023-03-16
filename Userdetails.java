package My_First_Project;
import java.util.*;
public class Userdetails {
	public static String name="";
	public static String mailid="";
	public static String mobilenumber="";
	public static int age=0;
	public static String gender;
	public static int addnum=0;
	public static void getDetails()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("***** Welcome come to the registraction...🙏 *****");
		System.out.println("Please enter your name:");
		name=sc.nextLine();
		System.out.println("Please enter your Mail-id:");
		mailid=sc.nextLine();
		System.out.println("Please enter your mobile number:");
		mobilenumber=sc.nextLine();
		System.out.println("Please enter your age:");
		age=sc.nextInt();
		System.out.println("enter genger(M/F) :");
		gender=sc.next();
		System.out.println("Enter your Addhar Number");
		addnum=sc.nextInt();
		
		
		
	}
}
