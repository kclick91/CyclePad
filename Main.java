import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		String[] numbs = new String[]{"NORTH", "NORTHEAST", "EAST", "SOUTHEAST","SOUTH", "SOUTHWEST", "WEST", "NORTHWEST"};
		
		Run(numbs);
	}
	public static void Run(String[] numbs)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("WELCOME TO THE CYCLEPAD");
		System.out.println("1. NORTH");
		System.out.println("2. NORTHEAST");
		System.out.println("3. EAST");
		System.out.println("4. SOUTHEAST");
		System.out.println("5. SOUTH");
		System.out.println("6. SOUTHWEST");
		System.out.println("7. WEST");
		System.out.println("8. NORTHWEST");
		System.out.println("Enter direction(1,2,3,4,5,6,7,8):");
		int direction = 0;
		Scanner strng = new Scanner(System.in);
		 try {
            direction = s.nextInt();
        }
        catch(Exception e) {
             
          }
		
		
		if (direction == 1)
		{
			System.out.print("Enter concentration: ");
			String str = strng.nextLine();
			Store(str, numbs, direction - 1);
			System.out.println("LAST EDITED: " + direction + " OR NORTH");
		}
		else if (direction == 2)
		{
			System.out.print("Enter concentration: ");
			String str = strng.nextLine();
			Store(str, numbs, direction - 1);
			System.out.println("LAST EDITED: " + direction + " OR NORTHEAST");
		}
		else if (direction == 3)
		{
			System.out.print("Enter concentration: ");
			String str = strng.nextLine();
			Store(str, numbs, direction - 1);
			System.out.println("LAST EDITED: " + direction + " OR EAST");
		}
		else if (direction == 4)
		{
			System.out.print("Enter concentration: ");
			String str = strng.nextLine();
			Store(str, numbs, direction - 1);
			System.out.println("LAST EDITED: " + direction + " OR SOUTHEAST");
		}
		else if (direction == 5)
		{
			System.out.print("Enter concentration: ");
			String str = strng.nextLine();
			Store(str, numbs, direction - 1);
			System.out.println("LAST EDITED: " + direction + " OR SOUTH");
		}
		else if (direction == 6)
		{
			System.out.print("Enter concentration: ");
			String str = strng.nextLine();
			Store(str, numbs, direction - 1);
			System.out.println("LAST EDITED: " + direction + " OR SOUTHWEST");
		}
		else if (direction == 7)
		{
			System.out.print("Enter concentration: ");
			String str = strng.nextLine();
			Store(str, numbs, direction - 1);
			System.out.println("LAST EDITED: " + direction + " OR WEST");
		}
		else if (direction == 8)
		{
			System.out.print("Enter concentration: ");
			String str = strng.nextLine();
			Store(str, numbs, direction - 1);
			System.out.println("LAST EDITED: " + direction + " OR NORTHWEST");
		}
		else if (direction <= 0 || direction > 8)
		{
			PrintSaved(numbs);
		}	
		PrintSaved(numbs);
		Run(numbs);
		
	}
	public static void Store(String storedString, String[] storage, int j)
	{
		storage[j] = storedString; 
	}
	
	public static void PrintSaved(String[] numbs)
	{
		System.out.println("TOPICS IN WORKING MEMORY");
		System.out.println("________________________");
		System.out.println(numbs[7] + "  =======    " + numbs[0] + "    ========     " + numbs[1]);
		System.out.println();
		System.out.println("             " + numbs[6] + " =========== " + numbs[2]);
		System.out.println();
		System.out.println(numbs[5] + " ========    " + numbs[4] + "    ========     " + numbs[3]);

		
		System.out.println();
	}
}
