/**
 * 
 */
package Directory;

/**
 * @author remjamd
 *
 */
public class Athlete extends Student {
	
	public Athlete(String firstName, String lastName, String type, int floor, int id)
	{
		super(firstName,lastName,type,floor, id);
		this.firstName = firstName;
		this.lastName = lastName;
		this.type = type;
		this.floor = floor;
		this.id = id;
	}

}
