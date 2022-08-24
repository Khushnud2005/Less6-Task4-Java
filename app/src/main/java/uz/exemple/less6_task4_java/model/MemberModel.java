package uz.exemple.less6_task4_java.model;

import java.io.Serializable;

public class MemberModel implements Serializable {
    private String name;
    private int age;
    private String department;

    public MemberModel(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return "MemberModel{" +
                "name= " + name +
                ", age= " + age +
                ", department= " + department +
                '}';
    }
}
