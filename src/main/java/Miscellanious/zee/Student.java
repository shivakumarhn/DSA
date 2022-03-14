package Miscellanious.zee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {

    String name;
    int id;
    int age;

    Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public int compareTo(Student s) {

        if (name.compareTo(s.name) > 0)
            return 1;
        else if (name.compareTo(s.name) < 0)
            return -1;
        else
            return 0;
    }


    public static void main(String[] args) {

        Student s1 = new Student("shiva", 1, 28);
        Student s2 = new Student("kumar", 2, 29);
        Student s3 = new Student("KUMAR", 3, 30);

        List<Student> list = new ArrayList<>();
        list.add(s2);
        list.add(s3);
        list.add(s1);

        Collections.sort(list);

       // System.out.println(list.stream().);

        for (Student s : list)
            System.out.println(s.name + " " + s.id + " " + s.age);



    }


}
