package lottery;

import java.util.HashSet;

public class customer 
{
	String id;
	int num1, num2, num3, num4, num5 , num6;
	
	public customer(String id, int num1, int num2, int num3, int num4, int num5, int num6) 
	{
		super();
		this.id = id;
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
		this.num5 = num5;
		this.num6 = num6;
	}

	@Override
	public String toString() {
		return "customer [id=" + id + ", num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + ", num4=" + num4
				+ ", num5=" + num5 + ", num6=" + num6 + "]\n\n";
	}
	
	

}
