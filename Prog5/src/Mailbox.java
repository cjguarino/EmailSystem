import java.util.ArrayList;
/**
 * Class: Mailbox.java
 * Course: CSCI 150
 * Author: Charles Guarino
 * Thursday, March 16th 2017
 * Formulates an array list of messages with the methods for a Mailbox 
 */
public class Mailbox
{
	String owner;
	ArrayList<Message> array = new ArrayList<Message>(); //creates an array list of messages

	/**
	 * Constructor: Mailbox
	 * @param a
	 * @param b
	 * Constructs a cleared Mailbox with an owner 
	 */
	public Mailbox(String name) 
	{
		array.clear();
		owner = name;
	}
	/**
	 * Method: getOwner
	 * @return owner 
	 */
	public String getOwner()
	{
		return owner;
	}
	
	/**
	 * Method: addMessage
	 * @param m
	 * add's the message to the array
	 */
	public void addMessage(Message m)
	{
		array.add(m);
	}//end of addMessage()
	
	/**
	 * Method: getMessage
	 * @param i
	 * @return array[i]
	 * returns the message at the index of i
	 */
	public Message getMessage(int i)
	{
		return array.get(i);
	}//end of getMessage()
	
	/**
	 * Method: removeMessage
	 * @param i
	 * removes the message at i
	 */
	public void removeMessage(int i)
	{
		array.remove(i);
	}//end of removeMessages()
	
	/**
	 * Method: getSize
	 * @return array.size() returns the arrays size
	 */
	public int getSize()
	{
		return array.size();
	}//end of getSize()
	
	/**
	 *  Method: toString
	 *  @return super.toString() returns the toString of it's super class
	 */
	public String toString()
	{
		return super.toString();
	}//end of toString()
}//Mailbox