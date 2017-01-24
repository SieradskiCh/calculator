import java.util.Scanner;
public class calculator
	{
	public static int pick;
	public static double user1;
	public static double user2;
		public static void main(String[] args)
			{
			setUp();
			//calculate();
			}
		public static void userPicking()
			{
			System.out.println("Ok, what two numbers would you like to use?");
			System.out.println("Starting Number:");
			java.util.Scanner userInput = new Scanner(System.in);
			user1 = userInput.nextDouble();
			System.out.println("Number2:");
			java.util.Scanner userInput1 = new Scanner(System.in);
			user2 = userInput1.nextDouble();
			}
		public static void chooseNumbers()
			{
			if (pick == 1)
				{
				userPicking();
				System.out.println("The total is " + add(user1, user2));
				}
			else if (pick == 2)
				{
				userPicking();
				System.out.println("The total is " + subtract(user1, user2));
				}
			else if (pick == 3)
				{
				userPicking();
				System.out.println("The total is " + multiply(user1, user2));
				}
			else if (pick == 4)
				{
				userPicking();
				System.out.println("The total is " + divide(user1, user2));
				}
			else if (pick == 5)
				{
				userPicking();
				System.out.println("The total is " + takeExponent(user1, user2));
				}
			}
		public static void setUp()
			{
			System.out.println("Welcome to Chase's amazingly superior calculator, which is much better than anything Dimitri could have come up with! What would you like to do today?");
			System.out.println("(1) Add");
			System.out.println("(2) Subtract");
			System.out.println("(3) Multiply");
			System.out.println("(4) Divide");
			System.out.println("(5) Find the exponent");
			java.util.Scanner userInput = new Scanner(System.in);
			pick = userInput.nextInt();
			chooseNumbers();
			}
		public static double add(double x, double y)
			{
			return x+y;
			}
		public static double subtract(double x, double y)
			{
			return x-y;
			}
		public static double multiply(double x, double y)
			{
			return x*y;
			}
		public static double divide(double x, double y)
			{
			return x/y;
			}
		public static double takeExponent(double x, double y)
			{
			return Math.pow(x,y);
			}
//work
		//ugh
	}
