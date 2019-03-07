package toys;

public class Runner {

	public static void main(String[] args) {
		ToyStore ts = new ToyStore();
		ts.loadToys("barbie barbie bratz woody ball ball woody buzz bratz toy bratz bratz woody dinosaur");
		System.out.println(ts);
		System.out.println("most frequent toy: " + ts.getMostFrequentToy().getName());
		ts.sortToysByCount();
		System.out.println(ts);
	}
	
}
