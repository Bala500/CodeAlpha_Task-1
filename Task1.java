import java.util.*;
public class Task1
{
	public static void main(String[] args)
	{
		
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter the Student Name :");
		String name=s1.next();
		System.out.print("Enter the Student Roll No :");
		int rollno=s1.nextInt();
		Collection<Integer> mark=new ArrayList<>();
		System.out.println("-------------");
		System.out.println("Enter the Subject & Student Mark & After Finished Student marks  Press 1");
		System.out.println("------");
		while(true)
		{
		System.out.print("Enter the Subject Name :");
		String subject=s1.next();
		System.out.print("Enter Student mark :");
		int mark1=s1.nextInt();
		System.out.println("-----------");
		if(mark1==1)
		{
			break;
		}
		mark.add(mark1);
		}
		if(mark.size()>0)
		{
			int Highest=Collections.max(mark);
			int lowest=Collections.min(mark);
			double average=Calculateaverage(mark);
			System.out.println("\nMark Details :");
			System.out.println("Highest Mark :"+Highest);
			System.out.println("Lowest Mark :"+lowest);
			System.out.println("Average Mark :"+average);
		}
		else {
			System.out.println("No Mark Were Entered");
		}
		s1.close();
	}

	private static double Calculateaverage(Collection<Integer> mark)
	{
		int sum=0;
		for(Integer mark1:mark)
		{
			sum+=mark1;
		}
		return (double)sum/mark.size();
	}
}