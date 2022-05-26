package com.company;
import com.sun.jdi.IntegerValue;

import java.util.*;
import java.io.*;
import java.util.stream.Stream;

import static com.company.Comparators.getComparatorByName;

public class PeopleList {
    String name , sex , word;
    int age , a = 0 , max , min , medium , number;
    List<People> list = new ArrayList<People>();
    Scanner scan = new Scanner(System.in);
    public void addDevice() throws IOException{
        list.add(new People(age , name , sex));
    }
    public void removePeople(){
        int numerator = 0 ;
        for (People people : list){
            numerator++;
            System.out.println(numerator + " - age - " + people.getAge() + " name - " + people.getName());
        }
        System.out.println("Enter people number");
        number = scan.nextInt()-1;
        list.remove(number);
    }
    public void watchPeople(){list.stream().forEach( people -> System.out.println("Age - " + people.getAge() + " Name - " + people.getName() + " Sex - " + people.getSex()));}
    public void sortNameAndAge(){
        list.sort(getComparatorByName());
        Collections.sort(list ,new ComparatorByAge());
    }
    public void sortName(){Collections.sort(list ,new ComparatorByName());}
    public void soliderList(){
        List<People> soliderList = new ArrayList<People>();
        list.stream().forEach(people -> {
            if (people.getAge() >= 18 && people.getAge() <= 27 && people.getSex().equals("man")){
                    soliderList.add(new People(people.getAge() , people.getName(), people.getSex()));
            }
        });
        soliderList.stream().forEach( people -> System.out.println("Age - " + people.getAge() + " Name - " + people.getName() + " Sex - " + people.getSex()));
    }
    public void maxAge(){
        max = 0;
        for ( People people : list ) {
            if ( max < people.getAge()){
                max = people.getAge();
            }
        }
        for ( People people : list ){
            if ( people.getAge() == max ){
                System.out.println("Age - " + people.getAge() + " Name - " + people.getName() + " Sex - " + people.getSex());
            }
        }
    }
    public void minAge(){
        min = 0;
        list.stream().forEach(people -> {
            if ( min > people.getAge()){
                min = people.getAge();
            }
        });
        list.stream().forEach(people -> {
            if ( people.getAge() == min ){
                System.out.println("Age - " + people.getAge() + " Name - " + people.getName() + " Sex - " + people.getSex());
            }
        });
    }
    public void mediumAge(){
        a = 0;
        medium = 0;
        list.stream().forEach(people -> {
            if ( people.getSex().equals("man")){
                medium = medium + people.getAge();
                a ++;
            }
        });
        System.out.println(medium/a);
    }
    public void workPerson(){
        a = 0;
        list.stream().forEach(people -> {
            if ( people.getSex().equals("man") && people.getAge()<=60 && people.getAge()>=18){
                a++;
            }
            if ( people.getSex().equals("woman") && people.getAge()<=55 && people.getAge()>=18){
                a++;
            }
        });
        System.out.println(a);
    }
    public void woman(){
        list.stream().forEach(people -> {
            if (people.getSex().equals("woman")) {
                a++;
            }
        });
        System.out.println(a);
    }
    public void man(){
        list.stream().forEach(people -> {
            if (people.getSex().equals("man")) {
                a++;
            }
        });
        System.out.println(a);
    }
    public void womanA(String letter){
        list.stream().forEach(people -> {
            word = String.valueOf(people.getName().charAt(0));
            if (people.getSex().equals("woman") && word.equals(letter)) {
                System.out.println("Age - " + people.getAge() + " Name - " + people.getName() + " Sex - " + people.getSex());
            }
        });
    }
}
