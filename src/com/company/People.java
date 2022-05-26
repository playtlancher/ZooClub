package com.company;

public class People {
    private int age;
    private String name , sex;

    public People(int age , String name , String sex ){
        this.age = age;
        this.name = name;
        this.sex = sex;
    }
    public int getAge(){return age;}
    public String getName(){
        return name;
    }
    public String getSex(){
        return sex;
    }
}
