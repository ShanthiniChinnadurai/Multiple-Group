package com.kgfsl;

import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.function.*;


public class App1 {
    public void actions() throws FileNotFoundException {

    Person person1 = new Person("John", "USA", "NYC", new Pet("Max", 5));
    Person person2 = new Person("Steve", "UK", "London", new Pet("Lucy", 8));
    Person person3 = new Person("Anna", "USA", "NYC", new Pet("Buddy", 12));
    Person person4 = new Person("Mike", "USA", "Chicago", new Pet("Duke", 10));
    
    List<Person> persons = Arrays.asList(person1, person2, person3, person4);

    
         Map<String,  Set<String>> personsByCountry = persons.stream().collect(Collectors.groupingBy( Person::getCountry, Collectors.toSet()));
        
        System.out.println("Persons in USA: " + personsByCountry.get("USA"));
    
    }

	
}