/**
 * Class: MailSystem.java
 * Course: CSCI 150
 * Author: Charles Guarino
 * Thursday, Feb 1st 2017
 * Formulates a message with a sender, recipient, and a body
 */
public class Message 
{
	private String sender;
	private String recipient;
	private String messageBody;
	
	/**
	 * Constructor: Message
	 * @param a is the sender
	 * @param b is the recipient
	 * inputs two parameters and initializes the sender and recipient names as well 
	 * as initializes the message body to the string ""
	 */
	public Message(String a, String b)
	{
		sender = a;
		recipient = b;
		messageBody = "";
	}//end of Message()
	
	/**
	 * Method: getSender
	 * @return sender
	 * returns the sender's name
	 */
	public String getSender()
	{
		return sender;
	}//end of getSender()
	
	/**
	 * Method: getRecipient
	 * @return recipient
	 * returns the recipient's name
	 */
	public String getRecipient()
	{
		return recipient;
	}//end of getRecipient()
	
	/**
	 * Method: append
	 * @param a is the new line to be added
	 * concatenates the new line of text to the current message body
	 * followed by a new line character
	 */
	public void append(String a)
	{
		messageBody = messageBody.concat(a + "\n");
	}//end of append()
	
	/**
	 * Method: toString
	 * @return fullMessage is the entire message
	 * returns the full message along with to and from message
	 */
	public String toString()
	{
		String fullMessage = "From: " + sender + "\n" + "To: " + recipient + "\n\n" + messageBody;
		return fullMessage;
	}//end of toString()

}//Message