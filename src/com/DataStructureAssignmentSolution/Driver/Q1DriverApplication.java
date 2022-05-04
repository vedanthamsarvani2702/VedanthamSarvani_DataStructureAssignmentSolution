package com.DataStructureAssignmentSolution.Driver;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class Q1DriverApplication {
	public static void main(String args[])
	{
		int floorCount,maxFloor,temp;
		Stack<Integer> floorStack=new Stack<Integer>();
		Queue<Integer> floorQueue = new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total no. of floors in the building");
		floorCount= sc.nextInt();
		for(int i=1 ; i<=floorCount ; i++)
		{
			System.out.println("Enter the floor size given on day : " + i);
			// insert elements at rear
			floorQueue.offer(sc.nextInt());
		}
		
		System.out.println("The order of construction is as follows");
		maxFloor=floorCount;
		for(int i=1 ; i<=floorCount ; i++)
		{
			
			System.out.println("Day : " + i);
			// deletes element at front
		     temp=floorQueue.poll();
		    if(temp==maxFloor) {
		    	System.out.print(temp);
		    	maxFloor--;
		    	
		    		while(!floorStack.isEmpty())
			    	{
		    			if(maxFloor == floorStack.peek())
		    			{
		    				System.out.print(" " + floorStack.pop());
				    		maxFloor--;
		    			}
		    			else
		    			{
		    				break;
		    				
		    			}
			    		
			    	}
		    		System.out.println("");
		    }
		    else
		    {
		    	floorStack.push(temp);
		    	System.out.println("");
		    	
		    }
		
		}
		
				
	}

}
