package javaTrainingPart2;
class Book1 implements Runnable
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
class Num1 extends Thread
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


public class Multithreadingclass1{
	public static void main(String args[]) throws InterruptedException
	{
		Runnable b = ()->{
		
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
		
		};
		Thread t2= new Thread();
		Book1 bc= new Book1();
		Num1 n= new Num1();
		t2.start();
		n.start();
		if(t2.isAlive())
		{
			System.out.println("Thread one is alive");
		}
		n.join();
		if(t2.isAlive())
		{
			System.out.println("Thread two is alive");
		}
		//bc.start();
	//	bc.updatedb();
		//n.Print();
System.out.println("Hello");
		//bc.stop();
	}

}
