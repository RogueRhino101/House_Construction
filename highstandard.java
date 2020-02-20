package house_construction;
import java.util.*;
public class highstandard 
{
float area; 
Scanner s=new Scanner(System.in);
public highstandard(float area)
	{
	this.area=area;
	}
public void result()
	{
		float cost=1800 * area;
		System.out.format("%s","The cost of construction is:"+cost);
	}

}