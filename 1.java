import java.util.*;

class student
{
  String name;
  int rollno;
  String phone;
  int age;
  float cgpa;
}

class exp1
{
	public static void main(String args[])
	{
		student obj[]=new student[10];
		
		for(int i=0;i<10;i++)
		{
			obj[i]=new student();
		}
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<10;i++)
		{		
		  System.out.println("Enter the details of student"+" "+(i+1));
		  
		  System.out.print("Name:");
		  obj[i].name=sc.nextLine();
		  
		  System.out.print("Roll No:");
		  obj[i].rollno=sc.nextInt();			
		  
		  System.out.print("Age:");
		  obj[i].age=sc.nextInt();
		  sc.nextLine();
			
		  System.out.print("Phone No:");
		  obj[i].phone=sc.nextLine();
		  
			
		  System.out.print("CGPA:");
		  obj[i].cgpa=sc.nextFloat();
		  sc.nextLine();
		}  
		
		int j=0,k=10,l=0;
		for(int i=0;i<10;i++)
		{
		  if(obj[j].cgpa<obj[i].cgpa)
		    j=i;
		
		  if(obj[i].name.equalsIgnoreCase("ANU"))
		    k=i;
		  
		  if(obj[l].age>obj[i].age)
		    l=i;
		}
		
		System.out.println("Name of student with highest CGPA:"+obj[j].name);
		
		if(k!=10)
		  System.out.println("Phone number of student named ANU:"+obj[k].phone);
		else
		  System.out.println("There is no student named ANU");
		  
		System.out.println("Roll number of youngest student:"+obj[l].rollno);
		
		sc.close();
	}
}
