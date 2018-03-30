/**
 * 
 */
package Directory;

/**
 * @author remjamd
 *
 */
public class Worker extends Student {
	
	double hours;
	
	public Worker(String firstName, String lastName, String type, int floor, int id, double hours)
	{
		super(firstName,lastName,type,floor, id);
		this.firstName = firstName;
		this.lastName = lastName;
		this.type = type;
		this.floor = floor;
		this.id = id;
		this.hours = hours;
	}

	
	
	
	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

}
