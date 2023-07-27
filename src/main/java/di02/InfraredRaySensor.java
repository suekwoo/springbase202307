package di02;

public class InfraredRaySensor {
	private String name;
	private boolean objectFounded;
	
	public InfraredRaySensor(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public boolean isObjectFounded() {
		return objectFounded;
	}

	@Override
	public String toString() {
		return "InfraredRaySensor [name=" + name + ", objectFounded=" + objectFounded + "]";
	}
	
	

}
