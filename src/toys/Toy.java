package toys;

public class Toy{
	
	private String name;
	private int count;
	
	public Toy() {
		
	}
	
	public Toy(String name) {
		this.name = name;
		this.count = 1;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name + " " + count;
	}

}
