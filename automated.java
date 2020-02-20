package house_construction;
import java.util.*;
public class automated
{
float area; 
Scanner s=new Scanner(System.in);
public automated(float area)
	{
            this.area=area;
	}
public void result()
	{
		float cost=2500 * area;
		System.out.format("%s","The cost of construction is:"+cost);
	}

}