import java.util.Scanner;
public class Project2_6
{
	public static void main(String[] args)
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The mass: ");
		int aNum= sc.nextInt();
		System.out.print("Enter the velocity: ");
		int bNum =sc.nextInt();
		int mom = aNum * bNum;
		System.out.println("The Momentum is " + mom);
	}
}