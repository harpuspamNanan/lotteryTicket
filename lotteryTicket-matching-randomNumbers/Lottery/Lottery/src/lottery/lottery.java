package lottery;

import java.text.NumberFormat;
import java.util.*;

public class lottery 
{
	ArrayList<customer> customerArray= new ArrayList<>();	
	ArrayList<Integer> storeRandomNumbers = new ArrayList<>();
	ArrayList<Integer> storeNumbersFromUser = new ArrayList<>(6);
	boolean flag = true;
	int countMatchingNumbers=0, priceMoney=0;	   
	
	Scanner keyboard = new Scanner(System.in);
	
	
	public void buyTickets()
	{
		
		String takeName="";
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0;
		
		
			System.out.println("Enter the Name ID: ");
			takeName = keyboard.next();
			System.out.println("Enter 1 Number: ");
			num1 = validateInput(num1);
			System.out.println("Enter 2 Number: ");
			num2 = validateInput(num2);
			System.out.println("Enter 3 Number: ");
			num3 = validateInput(num3);
			System.out.println("Enter 4 Number: ");
			num4 = validateInput(num4);
			System.out.println("Enter 5 Number: ");
			num5 = validateInput(num5);
			System.out.println("Enter 6 Number: ");
			num6 = validateInput(num6);
		
			
		
		
		customerArray.add(new customer(takeName, num1, num2, num3, num4, num5, num6));
		
		storeNumbersFromUser.add(num1);		storeNumbersFromUser.add(num2);		storeNumbersFromUser.add(num3);
		storeNumbersFromUser.add(num4);		storeNumbersFromUser.add(num5);		storeNumbersFromUser.add(num6);
			
		pickLottery(takeName ,storeNumbersFromUser);
	}

	
	public void pickLottery(String name, ArrayList<Integer> takeData)
	{
		Random rand1 = new Random();
		
		for(int i = 0; i< 6; i++)
			storeRandomNumbers.add(rand1.nextInt(8)+1);			// Random Number generated will be between 0-9
					
		System.out.println("\nThe Lottery Numbers are: "+storeRandomNumbers);
		
		for(Integer num : takeData)
		{
			if(storeRandomNumbers.contains(num))
				countMatchingNumbers++;
		}
		
		if (countMatchingNumbers == 4)
			priceMoney = 10000 ;
		else if (countMatchingNumbers == 5)
			priceMoney = 1000000 ;
		else if (countMatchingNumbers == 6)	
			priceMoney = 100000000;
		else
			priceMoney = 0;
		
		System.out.println("\nHey "+name+" you won, "+
		NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(priceMoney) // To get priceMoney in Currency format
		+" as you got "+countMatchingNumbers+" Numbers correct.");
		
		if(countMatchingNumbers == 6)
			System.out.println("\nCongratulations! You are the Winner of this Season.");
		else
			System.out.println("\nBetter Luck next Time.");
	}

	public int validateInput(int num)			// To check whether the Number input is between 1 and 9
	{
		boolean flag = true;
		num = keyboard.nextInt();
		while(flag)
		{				
			if(num <1 || num >9) {
				System.out.println("Please enter a number in the Range [1-9] : ");	
				num = keyboard.nextInt();			// OverWrite the Correct Input
			}
			
			else
				flag = false;			
		}		
		return num;
	}
}
