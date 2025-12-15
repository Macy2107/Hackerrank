import java.util.*;
import java.io.*;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private double cgpa;

public Student(int id, String name, double cgpa) {
    this.id = id;
    this.name = name;
    this.cgpa = cgpa;
}

public int getId() {
    return id;
}

public String getName() {
    return name;
}

public double getCgpa() {
    return cgpa;
}
}

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        
        List<Student> studentList = new ArrayList<Student>();
        
        while (testCases > 0) {
            
        int id = scanner.nextInt();
        String name = scanner.next();
        double cgpa = scanner.nextDouble();
        // ADD NEW STUDENT
        Student student = new Student(id, name, cgpa);
        studentList.add(student);     
        
        }
        
        // USE COMPARATOR TO SORT
        Collections.sort(studentList, Comparator.getName
                                                .getId
                                                .getCgpa);

        for (Student newStudent : studentList) {
            System.out.println(newStudent.getName());
        }
    }
}
