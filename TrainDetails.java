package My_First_Project;

import java.util.Scanner;

public class TrainDetails extends Displaydetails{
	public static String startposition="";
	public static String destination="";
	public static String date="";
	public static int train1seats=1;
	public static int train2seats=1;
	public static int train3seats=1;
public static void trainDetails()
{
	Scanner sc= new Scanner(System.in);
	System.out.println("From Station:");
	startposition=sc.nextLine();
	System.out.println("Destination:");
	destination=sc.nextLine();
	System.out.println("Date:");
	date=sc.nextLine();
	System.out.println("From:"+startposition+"    To:"+destination+"                             Date:"+date);
	System.out.println();
	System.out.println("-----------------------------------------------------------------------------");
	System.out.println("|                |                      |               |                   |");
	System.out.println("|Train Number    |Train Name            |srevive type   |tickets available  |");
	System.out.println("-----------------------------------------------------------------------------");
	System.out.println("|AbF1012         |Narsapur Exp          |Express        |                  "+train1seats +"|");
	System.out.println("-----------------------------------------------------------------------------");
	System.out.println("|AbF10143        |Trirupathi passenger  |passenger      |                  "+train1seats +"|");
	System.out.println("-----------------------------------------------------------------------------");
	System.out.println("|AbF10h46        |Demo Express          |Demo Express   |                  "+train1seats +"|");
	System.out.println("-----------------------------------------------------------------------------");
}}
