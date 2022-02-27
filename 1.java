import java.util.*;

class student
{
  String name;
  int rollno;
  String phone;
  int age;
  float cgpa;
}

class main
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
			
		  System.out.print("Phone No:");
		  obj[i].phone=sc.nextLine();
			
		  System.out.print("CGPA:");
		  obj[i].cgpa=sc.nextFloat();  
		}  
		
		int j=0,k=10,l=0;
		for(int i=0;i<9;i++)
		{
		  if(obj[i].cgpa<obj[i+1].cgpa)
		    j=i+1;
		
		  if(obj[i].name=="ANU")
		    k=i;
		  else if(obj[9].name=="ANU")
			k=9;
			
		  if(obj[i].age>obj[i+1].age)
		    l=i+1;
		}
		
		System.out.println("Name of student with highest CGPA:"+obj[j].name);
		
		if(k!=10)
		  System.out.println("Phone number of student named 'Anu':"+obj[k].phone);
		else
		  System.out.println("There is no student named ANU");
		  
		System.out.println("Roll number of youngest student:"+obj[l].age);
	}
}
