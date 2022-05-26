package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PeopleAndPets {
    String name;
    int number = 1 , numerator = 0;
    Scanner scan = new Scanner(System.in);
    List<Person> list = new ArrayList<Person>();
    public void addPeople() {
        System.out.println("Enter name");
        name = scan.nextLine();
        list.add(new Person(name));
    }
    public void watchPeople(){
        list.stream().forEach( people -> people.getPetsAndName());
    }
    public void petToPeople(){
        System.out.println("Choose a person");
        list.stream().forEach( people ->{
            System.out.println(number + " - " + people.getName());
            number++;
        } );
        numerator = scan.nextInt();
        number = 0;
        for(Person people : list){
            number++;
            if (number==numerator){
                people.peopleAddPet();
            }
        }
        number = 1;
    }
    public void removePeople(){
        System.out.println("Choose a person");
        list.stream().forEach( people ->{
            System.out.println(number + " - " + people.getName());
            number++;
        } );
        number = scan.nextInt()-1;
        list.remove(number);
        number = 1;
    }
        public void deletePet(){
        System.out.println("Choose a person");
        list.stream().forEach( people ->{
            System.out.println(number + " - " + people.getName());
            number++;
        } );
        numerator = scan.nextInt();
        number = 0;
        for(Person people : list){
            number++;
            if (number==numerator){
                people.getPets();
                System.out.println("Choose pet");
                numerator = scan.nextInt()-1;
                people.deletePet(numerator);
            }
        }
        number = 1;
    }
}
