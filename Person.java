package com.company.class28.maps.Tasks;

public class Person {

        /*
        Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object.
Print each object details.
         */
private String name;
private String lastName;
private int age;
private double salary;
private int EmpID;


public Person(int EmpID,String name,String lastName,int age,double salary){
    this.name=name;
    this.lastName=lastName;
    this.age=age;
    this.salary=salary;
this.EmpID=EmpID;
        }

public String getName(){
    return name;
}
public void setName(String name){
    this.name=name;
}
public String getLastName(){
    return lastName;
}
public void setLastName(){
    this.lastName=lastName;
}

public int getAge(){
    return  age;

}
public void setAge(){
    this.age=age;
}
public  double getSalary(){
    return salary;
}

    public void setSalary() {
        this.salary = salary;
    }

    public int getEmpID(){
    return EmpID;
    }
    public void setEmpID(){
        this.EmpID=EmpID;
    }
public String printUser(){
    return name+ " "+lastName+" "+age+" salary "+salary;
}


}



