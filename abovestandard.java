package house_construction;
import java.util.*;
public class abovestandard 
{
	float area; 
	Scanner s=new Scanner(System.in);
	public abovestandard(float area)
	{
	this.area=area;
	}
	public void result()
	{
		float cost=1500 * area;
		System.out.format("%s","The cost of construction is:"+cost);
	}

}