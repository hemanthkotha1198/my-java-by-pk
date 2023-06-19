package javaTrainingPart2;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicArray<T>{
	private static final int initialCapacity =4;
	private   T arr[];
	private  int size;
	private int capacity;

DynamicArray()
{
	size=0;
	arr=(T[]) new Object[initialCapacity];
	capacity=initialCapacity;
}
	public void add(T val) {
		if(size ==capacity)

		{
			expandArray();
		}
		arr[size++]=val;
	}
	private void expandArray()
	{
		capacity =capacity*2;
		arr=Arrays.copyOf(arr,capacity);
	}
public  void display( int val) {
		System.out.println("element in list:");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]+" ");
		}System.out.println();
	}
public void addpos(int pos,T val) {
	if(size ==capacity)

	{
		expandArray();
	}
	for(int i=size-1;i<pos;i--)
	{
		arr[i+1]=arr[i];
	}
	arr[pos]=val;
	size++;
	
	}
	

public void delpos(int pos) {
	for(int i=pos+1;i<size;i++)
	{
		arr[i-1]=arr[i];
	}
	size--;
	if(capacity>3*size && capacity >initialCapacity)
	{
		ShrinkArray();
	}
}
public void ShrinkArray()
{
	capacity/=3;
	arr=Arrays.copyOf(arr, capacity);
}
public int length()
{
	return size;
}
public static void main(String[] args) {
	int val=0,pos;
	boolean bol=true;
	DynamicArray<Integer> list = new DynamicArray();
	// TODO Auto-generated method stub
	Scanner sc= new Scanner(System.in);
	while (bol)
	{
	System.out.println("list Menu");
	System.out.println("1.insertat end");
	System.out.println("2.display.");
	System.out.println("3.insert at specific posit");
	System.out.println("4.delete at Specfic pos");
	System.out.println("5.exit.");
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		System.out.println("enter the data:");
		val=sc.nextInt();
		 list.add(val);
		 break;
	case 2:
		
		 list.display(val);break;
	case 3:

		System.out.println("enter the pos:");
		pos=sc.nextInt();
		if(pos<0)
		{
			System.out.println("invalid pos.");
		}
		else
		{
			System.out.println("enter the data:");
			val=sc.nextInt();
			 list.addpos(pos,val);
			 break;
		}
	case 4:

		System.out.println("enter the pos:");
		pos=sc.nextInt();
		if(pos<0)
		{
			System.out.println("invalid pos.");
		}
		else
		{
			 list.delpos(pos);
			 break;
		}
	case 5:
		bol=false;
	break;
	default :
		System.out.println("invalid choice");
			
		
	}
	}

}
}
