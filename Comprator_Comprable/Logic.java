package Comprator_Comprable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int id ;
    String name;

    public Student (int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Student that) {
        if(this.id > that.id){
            return 1;
        }else{
            return -1;
        }
    }
}

public class Logic {

    static Comparator<Student> comp = new Comparator<Student>() {

        public int compare(Student s1, Student s2) {
            if(s1.id > s2.id){
                return 1;
            }else{
                return -1;
            }
        }
    };
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(1,"Roopam"),
                new Student(2,"Sonali"),
                new Student(5,"Kanhiya"),
                new Student(4,"Betu")
        );

        Collections.sort(list,comp);

        for(Student s : list){
            System.out.println(s.id + " " + s.name);
        }
    }
}
