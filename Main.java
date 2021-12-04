import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		String[] numbs = new String[]{"NORTH", "EAST", "SOUTH", "WEST"};
		
		Run(numbs);
	}
	public static void Run(String[] numbs)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("WELCOME TO THE CENTER");
		System.out.println("1. NORTH");
		System.out.println("2. EAST");
		System.out.println("3. SOUTH");
		System.out.println("4. WEST");
		System.out.println("Enter direction(1,2,3,or 4):");
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
			System.out.println("LAST EDITED: " + direction + " OR EAST");
		}
		else if (direction == 3)
		{
			System.out.print("Enter concentration: ");
			String str = strng.nextLine();
			Store(str, numbs, direction - 1);
			System.out.println("LAST EDITED: " + direction + " OR SOUTH");
		}
		else if (direction == 4)
		{
			System.out.print("Enter concentration: ");
			String str = strng.nextLine();
			Store(str, numbs, direction - 1);
			System.out.println("LAST EDITED: " + direction + " OR WEST");
		}
		else if (direction <= 0 || direction > 4)
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
		System.out.println("  =======    " + numbs[0] + "    ========     ");
		System.out.println();
		System.out.println(numbs[3] + " =========== " + numbs[1]);
		System.out.println();
		System.out.println(" ========    " + numbs[2] + "    ========     ");

		
		System.out.println();
	}
}

