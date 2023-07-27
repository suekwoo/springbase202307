package di01;

public class Greeter {
	private String format;
	public String greet(String guest) {
		return String.format(format,guest); 	}

	public void setFormat(String format) {
		System.out.println("1=====format");
		this.format = format;
	}
}
