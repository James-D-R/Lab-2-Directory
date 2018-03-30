/**
 * 
 */
package Directory;

/**
 * @author remjamd
 *
 */
public abstract class Student {
	
	protected String firstName;
	protected String lastName;
	protected String type;
	protected int floor;
	protected int id;
	
	
	public Student()
	{
		
	}
	public Student(String firstName, String lastName, String type, int floor, int id)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.type = type;
		this.floor = floor;
		this.id = id;
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}


