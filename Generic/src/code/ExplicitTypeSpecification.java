package code;

//: generics/ExplicitTypeSpecification.java
import java.util.List;
import java.util.Map;

import Models.pets.Person;
import Models.pets.Pet;

public class ExplicitTypeSpecification {
  static void f(Map<Person, List<Pet>> petPeople) {}
  public static void main(String[] args) {
    f(New.<Person, List<Pet>>map());
  }
} ///:~
