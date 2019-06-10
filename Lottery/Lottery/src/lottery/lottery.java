package lottery;

import java.util.ArrayList;
import java.util.Random;

public class lottery 
{
	ArrayList<customer> customerArray= new ArrayList<customer>();	
	int[] storeRandomNumbers = new int[6];
	
	public void buyTickets()
	{				
		customerArray.add(new customer("Har", 4, 6, 7,8, 7,9));
		customerArray.add(new customer("Tirth", 4, 4, 4,4, 4,4));
		
		System.out.println(customerArray);
	}        
	
	public void pickLottery()
	{
		Random rand1 = new Random();
		
		for(int i = 0; i< 6; i++)
		{
			storeRandomNumbers[i] = rand1.nextInt(8)+1;
			System.out.println(storeRandomNumbers[i]);
		}
		
		if(customerArray.In)
	}

	
}
