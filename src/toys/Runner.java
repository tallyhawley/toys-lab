package toys;

public class Runner {

	public static void main(String[] args) {
		ToyStore ts = new ToyStore();
		ts.loadToys("barbie barbie bratz woody woody buzz bratz bratz bratz dinosaur");
		System.out.println(ts);
		System.out.println(ts.getMostFrequentToy());
		ts.sortToysByCount();
		System.out.println(ts);
	}
	
}
