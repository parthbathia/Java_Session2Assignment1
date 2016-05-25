import java.io.*;

class Vote{

	public static void main(String[] args) throws Exception
	{

		int age;

		System.out.print("Enter your age : ");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		age = Integer.parseInt(br.readLine());

		if(age >= 18)
			System.out.println("\nYou are eligible to vote.");

		else
			System.out.println("\nYou are ineligible to vote.");			

	}

}