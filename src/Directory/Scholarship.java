/**
 * 
 */
package Directory;

/**
 * @author remjamd
 *
 */
public class Scholarship extends Student{
	
	public Scholarship(String firstName, String lastName, String type, int floor, int id)
	{
		super(firstName,lastName,type,floor, id);
		this.firstName = firstName;
		this.lastName = lastName;
		this.type = type;
		this.floor = floor;
		this.id = id;
	}

}
