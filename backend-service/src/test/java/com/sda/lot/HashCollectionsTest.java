package com.sda.lot;

import org.junit.jupiter.api.Test;


import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class HashCollectionsTest {
    @Test
    public void equalityTestForPersons(){
        Person mariusz = new Person("Mariusz");
        Person mariusz2 = new Person("Mariusz");


        boolean theSame =  mariusz2.equals(mariusz);
        System.out.println("The same objects??: " + theSame);
        //equals vs ==
        boolean theSame2 =  mariusz2 == mariusz;
        System.out.println("The same value??: " + theSame2);

        List<Person> persons = List.of(mariusz2,mariusz);
        System.out.println("persons size: " + persons.size());
        System.out.println("Is Mariusz on the list?: " + persons.contains(mariusz));
        System.out.println("Is Mariusz2 on the list?: " + persons.contains(mariusz2));


        // hashcode computed
        // hashcode as bucket id
        Set<Person> personSet = new HashSet<>();
        personSet.add(mariusz);
        personSet.add(mariusz2);
        System.out.println("person's set size: " + personSet.size());

    }
}
