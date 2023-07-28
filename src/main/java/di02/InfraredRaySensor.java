package di02;

public class InfraredRaySensor {
	private String name;
	private boolean objectFounded;  //default false
	
	public InfraredRaySensor(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public boolean isObjectFounded() {
		return objectFounded;
	}
	
	public void foundObject() {
		this.objectFounded = true;
	}
	

	@Override
	public String toString() {
		return "InfraredRaySensor [name=" + name + ", objectFounded=" + objectFounded + "]";
	}
	
	

}
