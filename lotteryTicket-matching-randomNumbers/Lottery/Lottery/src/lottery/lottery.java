package lottery;

import java.text.NumberFormat;
import java.util.*;

public class lottery 
{
	ArrayList<customer> customerArray= new ArrayList<customer>();	
	ArrayList<Integer> storeRandomNumbers = new ArrayList<>();
	ArrayList<Integer> storeNumbersFromUser = new ArrayList<>(6);
	boolean flag = true;
	
//	int[] splitTheArray =new int[10];
	int countMatchingNumbers=0, priceMoney=0;	   
	
	public void buyTickets()
	{
		Scanner keyboard = new Scanner(System.in);
		String takeName;
		int num1, num2, num3, num4, num5, num6;
		
		while(flag)
		{
			System.out.println("Enter the Name ID: ");
			takeName = keyboard.next();
			System.out.println("Enter 1 Number: ");
			num1 = keyboard.nextInt();
			System.out.println("Enter 2 Number: ");
			num2 = keyboard.nextInt();
			System.out.println("Enter 3 Number: ");
			num3 = keyboard.nextInt();
			System.out.println("Enter 4 Number: ");
			num4 = keyboard.nextInt();
			System.out.println("Enter 5 Number: ");
			num5 = keyboard.nextInt();
			System.out.println("Enter 6 Number: ");
			num6 = keyboard.nextInt();
			
			customerArray.add(new customer(takeName, num1, num2, num3, num4, num5, num6));
			storeNumbersFromUser.add(num1);		storeNumbersFromUser.add(num2);		storeNumbersFromUser.add(num3);
			storeNumbersFromUser.add(num4);		storeNumbersFromUser.add(num5);		storeNumbersFromUser.add(num6);
			
			pickLottery(takeName ,storeNumbersFromUser);
			
			System.out.println("\nDo you wish to enter another data [y/n]- ");
			if(keyboard.next().equalsIgnoreCase("n"))
			{
				flag = false;
				System.out.println("The Data you have entered is: \n"+customerArray);   // So far, Working 
			}
		}
	}

	
	public void pickLottery(String name, ArrayList<Integer> takeData)
	{
		Random rand1 = new Random();
		
		for(int i = 0; i< 6; i++)
			storeRandomNumbers.add(rand1.nextInt(8)+1);
					
		System.out.println("The Lottery Numbers are: "+storeRandomNumbers);
		
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
			priceMoney = 1000000;
		else
			priceMoney = 0;
		
		System.out.println("\nHey "+name+" you won, "+
		NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(priceMoney) // To get priceMoney in Currency format
		+" as you got "+countMatchingNumbers+" Numbers correct."+"\nBetter Luck next Time.");		
	}

	
}
