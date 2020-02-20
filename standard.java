package house_construction;

import java.util.*;
public class standard 
{
float area; 
Scanner s=new Scanner(System.in);
public standard(float area)
	{
	this.area=area;
	}
public void result()
	{
		float cost=(1200 * area);
		System.out.format("%s","The cost of construction is: Rs."+cost);
	}

}