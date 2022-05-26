package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name , nameP , type;
    private int number = 0;
    List<Pet> list = new ArrayList<Pet>();
    Scanner scan = new Scanner(System.in);
    public Person(String name){
        this.name = name;
    }

    public void peopleAddPet(){
        System.out.println("Enter name");
        nameP = scan.nextLine();
        System.out.println("Enter pet type");
        type = scan.nextLine();
        list.add(new Pet(nameP,type));
    }
    public String getName(){
        return name;
    }
    public void getPetsAndName(){
        System.out.println("Name - " + name );
        System.out.print("Pets - ");
        list.stream().forEach( account -> System.out.print(account.getName() + ", "));
        System.out.println("");
    }
    public void getPets(){
        list.stream().forEach( account -> {
            number++;
            System.out.println(number +" - "+ account.getName());
        });
    }
    public void deletePet(int a){
        list.remove(a);
    }
}
