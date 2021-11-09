import java.util.Scanner;
/**
 * Class: Prog5.java 
 * Course: CSCI 150 
 * Author: Charles Guarino
 * Thursday, March 23rd 2017
 * Tests the MailSystem, Mailbox, and Message Classes
 */
public class Prog5 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		MailSystem mySystem = new MailSystem();
		Message m;
		String menuAnswer;
		String username = "";

		do 
		{ 
			System.out.println("L)og In    W)rite message    I)nbox   S)ent Mail    O)ff—Log Out     E)xit");
			menuAnswer = scan.next();

			if (menuAnswer.equalsIgnoreCase("l")) // Menu Option: Logs In
			{
				if (username.length() == 0) 
				{
					System.out.println("Enter Username: ");
					username = scan.next();
				} else
					System.out.println("You must log out first!");
			}
			
			if (username.length() > 0) // Makes sure someone is logged in
			{
				if (menuAnswer.equalsIgnoreCase("w")) // Menu Option: Write Message
				{
					System.out.println("Enter name of recipient: ");
					String recipient = scan.next();
					m = new Message(username, recipient);
					System.out.println("Enter several lines of text terminated by an empty line: ");
					String str = scan.nextLine();
					while (!(str = scan.nextLine()).equals("")) 	
						m.append(str);

					mySystem.deliver(m);
					System.out.println("Message delivered successfully!");
				}
				if (menuAnswer.equalsIgnoreCase("i"))// Menu Option: Print Inbox
					mySystem.printMessages(username, "inbox");

				if (menuAnswer.equalsIgnoreCase("s")) // Menu Option: Prints Outbox
					mySystem.printMessages(username, "outbox");

				if (menuAnswer.equalsIgnoreCase("o")) // Menu Option: Logs Out
				{
					username = "";
					System.out.println("You have been successfully logged out!");
				}
			} 
			else 
			{
				System.out.println("You Must Log In First!\nEnter Username: ");
				username = scan.next();
			}
		} while (!menuAnswer.equalsIgnoreCase("e"));// Menu Option: Exits the program
		System.out.println("You have successfully exited. Thank you for using this program!");
	}
}
