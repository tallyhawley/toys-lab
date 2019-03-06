package toys;

import java.util.ArrayList;

public class ToyStore {
	
	private ArrayList<Toy> toyList;
	
	public ToyStore() {
		toyList = new ArrayList<Toy>();
	}
	
	public void loadToys(String toys) {
		String[] toyArray = toys.split(" ");
		ArrayList<String> toyNames = new ArrayList<String>();
		for(String t : toyArray) {
			if(!toyNames.contains(t)) {
				toyList.add(new Toy(t));
				toyNames.add(t);
			}
			else {
				Toy toy = toyList.get(toyNames.indexOf(t));
				toy.setCount(toy.getCount()+1);
			}
		}
	}
	
	public Toy getThatToy(String name) {
		for(Toy t : toyList) {
			if(t.getName().equals(name)) {
				return t;
			}
		}
		return null;
	}
	
	public Toy getMostFrequentToy() {
		Toy temp = toyList.get(0);
		for(Toy t : toyList) {
			if(t.getCount()>temp.getCount()) {
				temp = t;
			}
		}
		
		return temp;
		
	}
	
	public void sortToysByCount() {
		Toy temp = getMostFrequentToy();
		ArrayList<Toy> list = new ArrayList<Toy>();
		list.add(temp);
		toyList.remove(temp);
		while(toyList.size()>0){
			temp = getMostFrequentToy();
			list.add(0, temp);
			toyList.remove(temp);
		}
		for(Toy t : list) {
			toyList.add(t);
		}
	}
	
	public String toString() {
		return toyList.toString();
	}
	
	
}
