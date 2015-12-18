package code;

import java.util.List;
import java.util.Map;

import Models.pets.Person;
import Models.pets.Pet;

public class LimitsOfInference {
	static void f(Map<Person, List<? extends Pet>> petPeople) {
	}
	static <K,V> void g(Map<K, V> petPeople) {
	}

	
	public static void main(String[] args) {
		 f(New.map()); // Does not compile
		 g(New.map());
		 Map<Person, List<? extends Pet>> petPeople;
		 g(petPeople);
	}
} // /:~
