/**
 * 
 */
package Directory;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author remjamd
 *
 */
public class Main 
{
	

	public static void main(String[] args) 
	{
	// Declarations
	Scanner input = new Scanner(System.in);

	String first, last, studentType;
	int  floorNum, studId;
	double workHours;
	
	String exit = "";
	String check = "quit";
	String done = "none";
	
	ArrayList<Worker> workers = new ArrayList<Worker>();
	ArrayList<Athlete> athletes = new ArrayList<Athlete>();
	ArrayList<Scholarship> scholarships = new ArrayList<Scholarship>();
	//end declarations
	
	System.out.println("Welcome to the Dunwoody Resident Directory.\nPress enter to begin.");
	input.nextLine();
	
	while((done.equals("none")))
	{
		try
		{
			
		
		System.out.println("Please enter the type of Resident (Worker, Athlete, or Scholarship):");
		studentType = input.nextLine();
		studentType = studentType.toUpperCase();
		
		
		if (studentType.equals("WORKER"))
			{
			System.out.println("Enter the resident's first name:");
			first = input.nextLine();
			System.out.println("\nEnter the resident's last name:");
			last = input.nextLine();
			System.out.println("Choose a floor number for the Resident(1-3):");
			floorNum = input.nextInt();
			input.nextLine();
			while(floorNum != 1 && floorNum != 2 && floorNum != 3)
			{
				System.out.println("Workers can only be placed on floors 1-3.");
				floorNum = input.nextInt();
				input.nextLine();
			}
			System.out.println("Enter the Student Worker's monthly work hours:");
			workHours = input.nextDouble();
			System.out.println("Please create a 6-digit ID number for the resident:");
			studId = input.nextInt();
			input.nextLine();
			String len = Integer.toString(studId);
			while(len.length() != 6)
			{
				System.out.println("ID must be six digits.");
				studId = input.nextInt();
				input.nextLine();
				len = Integer.toString(studId);
			}
			
			workers.add(new Worker(first, last, studentType, floorNum, studId, workHours));
			System.out.println("Resident successfully added.");
			}
		
		else if (studentType.equals("ATHLETE"))
			{
			System.out.println("Enter the resident's first name:");
			first = input.nextLine();
			System.out.println("\nEnter the resident's last name:");
			last = input.nextLine();
			System.out.println("Choose a floor number for the Resident(4-6):");
			floorNum = input.nextInt();
			input.nextLine();
			while(floorNum != 4 && floorNum != 5 && floorNum != 6)
			{
				System.out.println("Athletes can only be placed on floors 4-6.");
				floorNum = input.nextInt();
				input.nextLine();
			}
			System.out.println("Please create a 6-digit ID number for the resident:");
			studId = input.nextInt();
			input.nextLine();
			String len = Integer.toString(studId);
			while(len.length() != 6)
			{
				System.out.println("ID must be six digits.");
				studId = input.nextInt();
				input.nextLine();
				len = Integer.toString(studId);
			}
			
			athletes.add(new Athlete(first, last, studentType, floorNum, studId));
			System.out.println("Resident successfully added.");
			}
		
		else if (studentType.equals("SCHOLARSHIP"))
		{
			System.out.println("Enter the resident's first name:");
			first = input.nextLine();
			System.out.println("\nEnter the resident's last name:");
			last = input.nextLine();
			System.out.println("Choose a floor number for the Resident(7-8):");
			floorNum = input.nextInt();
			input.nextLine();
			while(floorNum != 7 && floorNum != 8)
			{
				System.out.println("Scholarship Students can only be placed on floors 7-8.");
				floorNum = input.nextInt();
				input.nextLine();
			}
			System.out.println("Please create a 6-digit ID number for the resident:");
			studId = input.nextInt();
			input.nextLine();
			String len = Integer.toString(studId);
			while(len.length() != 6)
			{
				System.out.println("ID must be six digits.");
				studId = input.nextInt();
				input.nextLine();
				len = Integer.toString(studId);
			}
			
			scholarships.add(new Scholarship(first, last, studentType, floorNum, studId));
			System.out.println("Resident successfully added.");
		}
		
		else
		{
			System.out.println("Invalid student type entered.");
		}
		
		System.out.println("\nPress enter to add another resident or enter any key to quit.");
		exit = input.nextLine();
		System.out.println("");
		
		if(!(exit.equals("")))
		{
			done = check;
		}
		}
		catch (Exception i)
		{
			System.out.println("Invalid input was entered, please re-enter the resident's information.");
			input.nextLine();
		}
	}
	
	
	System.out.println("WORKERS:");
	
	for (int x = 0; x < workers.size(); x++)
	{
		Worker item = workers.get(x);
		workHours = item.hours;
		double pay = workHours * 0.5 * 14.00;
		double rent = 1245.00 - pay;
		String a = item.lastName + "-";
		String b = "Floor#:" + item.floor;
		String c = "Monthly Hours:" + item.hours;
		String d = "ID:" + item.id;
		String e = "Monthly Rent:$" + rent;
		
		System.out.printf("%-2s %-10s %15s %24s %15s %28s %n",item.firstName,a,b,c,d,e);
	}
	
	System.out.println("\nATHLETES:");
	
	for (int x = 0; x < athletes.size(); x ++)
	{
		Athlete item = athletes.get(x);
		String a = item.lastName + "-";
		String b = "Floor#:" + item.floor;
		String c = "ID:" + item.id;
		String d = "Monthly Rent:$1200";
		
		System.out.printf("%-2s %-10s %15s %15s %28s %n", item.firstName,a,b,c,d);
	}
	
	System.out.println("\nSCHOLARSHIPS:");
	
	for(int x = 0; x < scholarships.size(); x++)
	{
		Scholarship item = scholarships.get(x);
		String a = item.lastName + "-";
		String b = "Floor#:" + item.floor;
		String c = "ID:" + item.id;
		String d = "Monthly Rent:$100";
		
		System.out.printf("%-2s %-10s %15s %15s %28s %n", item.firstName,a,b,c,d);
	}
	
	System.out.println("\nProgram concluded.");
	
	
	
	
	
	
	}
}
