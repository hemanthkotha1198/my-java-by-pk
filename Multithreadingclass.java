package javaTrainingPart2;
class Book extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("DB is updated.");
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
			System.out.println("error");
			}
		}
	}
}
class Num extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
	{
			System.out.println(i);
		
		}
	}
}
//class Num implements Runnable 
//{
//	void run1()
//	{
//		for(int i=0;i<10;i++)
//		{
//			System.out.println(i);
//			try
//			{
//				Thread.sleep(2000);
//			}
//			catch(InterruptedException e)
//			{
//			System.out.println("error");
//			}
//		}
//	}
//}


public class Multithreadingclass {
	public static void main(String args[])
	{
		Book bc= new Book();
		Num n= new Num();
		n.start();
		bc.start();
	//	bc.updatedb();
		//n.Print();
System.out.println("Hello");
		bc.stop();
	}

}
