package chap11;

import typeinfo.pets.*;

import java.util.*;

public class MapOfList {
    public static Map<Person, List<? extends Pet>> petPerson = new HashMap<Person, List<? extends Pet>>();
    static {
        petPerson.put(new Person("Dawn"), Arrays.asList(new Cymric("Molly"), new Mutt("Spot")));
        petPerson.put(new Person("Kate"), Arrays.asList(new Cat("Elsie May"), new Dog("Margrett"), new Cat("Shackleton")));
        petPerson.put(new Person("Marilyn"), Arrays.asList(
                new Pug("Louie aka Louis Snorkelstein Depree"),
                new Cat("Stanford aka Stinky el Negro"),
                new Cat("Pinkola")));
        petPerson.put(new Person("Luke"), Arrays.asList(new Rat("Fuzzy"), new Rat("Fizzy")));
        petPerson.put(new Person("Isaac"), Arrays.asList(new Rat("Freckly")));
    }
    public static void main(String[] args) {
        System.out.println("People: " + petPerson.keySet());
        System.out.println("Pets: " + petPerson.values());
        for(Person person: petPerson.keySet()) {
            System.out.println(person + " has: ");
            for(Pet pet : petPerson.get(person)) {
                System.out.println("    " + pet);
            }
        }
    }
}
