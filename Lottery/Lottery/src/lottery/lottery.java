package lottery;

import java.util.*;

public class lottery 
{
	ArrayList<customer> customerArray= new ArrayList<customer>();	
	ArrayList<Integer> storeRandomNumbers = new ArrayList<>();
	
	int[] splitTheArray =new int[10];
	int t=0;
	
	public void buyTickets()
	{				
		customerArray.add(new customer("Jon", 4, 6, 7,8, 7,9));
		customerArray.add(new customer("Adams", 4, 4, 4,4, 4,4));
		
		System.out.println(customerArray);
	}        
	
	public void pickLottery()
	{
		Random rand1 = new Random();
		
		for(int i = 0; i< 6; i++)
		{
			storeRandomNumbers.add(rand1.nextInt(8)+1);
			
		}
		System.out.println(storeRandomNumbers);
		
		
		
		//splitTheArray[t++] = Integer.parseInt(customerArray[0][1]);
		
	   // System.out.println("Common Items: "+(customerArray.stream().filter(storeRandomNumbers::contains).collect(Collectors.toList())));
	
		
		
	
	}

	
}
