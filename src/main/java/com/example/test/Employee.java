package com.example.test;

public class Employee {

    public int ID;
    public String Name;
    public String Position;
    public String Office;
    public Integer Age;
    public String Salary;

    public Employee(String name, String position, String office, Integer age, String salary) {
        Name = name;
        Position = position;
        Office = office;
        Age = age;
        Salary = salary;
    }

    public Employee(int ID, String name, String position, String office, Integer age, String salary) {
        this.ID = ID;
        Name = name;
        Position = position;
        Office = office;
        Age = age;
        Salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getOffice() {
        return Office;
    }

    public void setOffice(String office) {
        Office = office;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }
}
