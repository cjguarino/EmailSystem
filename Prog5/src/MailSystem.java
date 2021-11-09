import java.util.ArrayList;
/**
 * Class: MailSystem.java
 * Course: CSCI 150
 * Author: Charles Guarino
 * Thursday, March 16th 2017
 * Formulates a mail system that creates an array list of Mailboxes.
 */
public class MailSystem
{
	ArrayList<Mailbox> mbList; //creates an array list of Mailboxes
	
	/**
	 * Constructor: MailSystem
	 * Instantiates the array list of mailboxes
	 */
	public MailSystem()
	{
		mbList = new ArrayList<Mailbox>();
	}
	
	/**
	 * Method: deliver
	 * @param m = message
	 * creates a mailbox for the sender and the recipient if they do not
	 * have one then adds the message to both the sender and the recipients mailboxes
	 */
	public void deliver(Message m) 
	{
		String sender = m.getSender(); // gets sender
		String recipient = m.getRecipient(); // gets recipient
		int senderIndex = getIndex(sender); // gets sender index
		int recipientIndex = getIndex(recipient); // gets recipient index
		
		if (senderIndex == -1) 
			mbList.add(new Mailbox(sender)); // adds a new mailbox 
			senderIndex = getIndex(sender);	// changes the index of the new mailbox
			
		if (recipientIndex == -1)
			mbList.add(new Mailbox(recipient)); // adds a new mailbox
			recipientIndex = getIndex(recipient); // changes the index of the new mailbox
		
		Mailbox senderMB = mbList.get(senderIndex); // sets the sender mailbox
		Mailbox recipientMB = mbList.get(recipientIndex); //sets the recipient mailbox
		
		senderMB.addMessage(m); //adds message to mailbox
		recipientMB.addMessage(m); //adds message to mailbox
		
	}//end of deliver()
	
	/**
	 * Method: printMessages
	 * @param owner
	 * @param messageType
	 * finds the owners mailbox then prints all the messages of the decided type "inbox" or "outbox"
	 */
	public void printMessages(String owner, String messageType) 
	{
		int ownerIndex = getIndex(owner); //gets index of owner

		if (ownerIndex == -1) // checks to see if there were any messages
			System.out.println("No Messages");
		else 
		{
			Mailbox mb = mbList.get(ownerIndex); //gets the mailbox of the owner
			for (int x = 0; x < mb.getSize(); x++) // scans every message in the owners mailbox								 
			{
				Message message = mb.getMessage(x); // gets the current message
				if (messageType.equalsIgnoreCase("inbox")) 
				{
					if (message.getRecipient().equalsIgnoreCase(owner)) // finds the inbox messages
						System.out.print(message.toString());
				}
				if (messageType.equalsIgnoreCase("outbox")) 
				{
					if (message.getSender().equalsIgnoreCase(owner)) // finds the outbox messages
						System.out.print(message.toString());
				}
			}
			System.out.println();
		}
	}// end of printMessages()
	
	/**
	 * Method: getIndex
	 * @param owner
	 * @return the index of the owners mailbox in the array list mbList
	 */
	private int getIndex(String owner)
	{
		for (int i = 0; i < mbList.size(); i++)
		{
			String str = mbList.get(i).getOwner();
			if (str.equalsIgnoreCase(owner))
				return i;
		}
		return -1;
	}//end of getIndex()
	
}//end of MailSystem