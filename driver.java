package house_construction;
import house_construction.standard;
import house_construction.abovestandard;
import house_construction.highstandard;
import house_construction.automated;
import java.util.*;
public class driver {

		public static void main(String[] args) 
		{
			int auto=0;
			System.out.format("%s","Enter the standard of the material to be used: 1: standard, 2:above standard or 3:high standard):  ");
			Scanner s=new Scanner(System.in);
			int material=s.nextInt(); 
			if(material==3)
			{
			System.out.format("%s","Confirm if you want the house to be fully automated: 1: yes or 2: no :    ");
			auto=s.nextInt();
			}
			System.out.format("%s","Enter the area of the house in squarefeets");
			float area=s.nextFloat();
			if(material==1)
			{
				standard obj1=new standard(area);
				obj1.result();
			}
			if(material==2)
			{
				abovestandard obj2=new abovestandard(area);
				obj2.result();
			}
			if(material==3)
			{
				highstandard obj3=new highstandard(area);
				obj3.result();
			}
			if(material==1 && auto==1)
			{
				automated obj4=new automated(area);
				obj4.result();
			}
		}
}

